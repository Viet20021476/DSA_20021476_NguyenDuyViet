import java.util.*;

public class Ex5 {
    public static List<Double> runningMedian(List<Integer> a) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>();
        List<Double> result = new ArrayList<Double>();
        double median = a.get(0);

        for (Integer i : a) {
            if (i >= median) {
                minPQ.offer(i);
            } else {
                maxPQ.offer(i);
            }

            while (maxPQ.size() - minPQ.size() > 1) {
                minPQ.offer(maxPQ.remove());
            }

            while (minPQ.size() - maxPQ.size() > 1) {
                maxPQ.offer(minPQ.remove());
            }

            if (minPQ.size() == maxPQ.size()) {
                median = (double) (minPQ.peek() + maxPQ.peek()) / 2;
                result.add(median);
            } else if (minPQ.size() > maxPQ.size()) {
                median = minPQ.peek();
                result.add(median);
            } else {
                median = maxPQ.peek();
                result.add(median);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(4);
        a.add(5);
        a.add(3);
        a.add(8);
        a.add(7);

        List<Double> b = runningMedian(a);

        System.out.println(b);
    }
}
