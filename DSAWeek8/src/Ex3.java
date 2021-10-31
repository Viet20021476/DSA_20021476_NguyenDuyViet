import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ex3 {

    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
        for (Integer number : A) {
            pqueue.offer(number);
        }
        if (pqueue.size() == 1) {
            if (pqueue.remove() >= k) return 0;
            else return -1;
        }
        int count = 0;

        while (pqueue.size() >= 1) {
            if (pqueue.peek() >= k) return count;
            int m1 = pqueue.remove();
            int m2 = pqueue.remove();
            pqueue.offer(m1 + 2 * m2);
            count++;
        }
        if (pqueue.peek() >= k) return count;
        return -1;

    }

    public static void main(String[] args) {
    }
}
