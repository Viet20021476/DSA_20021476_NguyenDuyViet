import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex2 {
    static class Vertex {
        List<Edge> neighbors;

        public Vertex() {
            neighbors = new ArrayList<>();
        }
    }

    static class Edge implements Comparable<Edge> {
        int dest;
        int weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        public int compareTo(Edge another) {
            return this.weight - another.weight;
        }
    }

    int prims(Vertex[] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        int minCost = 0;
        PriorityQueue<Edge> minPq = new PriorityQueue<>();
        visited[start] = true;
        minPq.addAll(graph[start].neighbors);
        while (!minPq.isEmpty()) {
            Edge t = minPq.remove();
            if (visited[t.dest]) continue;
            visited[t.dest] = true;
            minCost += t.weight;
            minPq.addAll(graph[t.dest].neighbors);
        }
        return minCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vertex[] graph = new Vertex[n + 1];
        for (int j = 1; j <= n; j++) {
            graph[j] = new Vertex();
        }
        for (int i = 1; i <= m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            Edge e1 = new Edge(y, w);
            graph[x].neighbors.add(e1);
            Edge e2 = new Edge(x, w);
            graph[y].neighbors.add(e2);
        }
        int start = sc.nextInt();
        Ex2 ex2 = new Ex2();
        System.out.println(ex2.prims(graph, start));
    }
}

