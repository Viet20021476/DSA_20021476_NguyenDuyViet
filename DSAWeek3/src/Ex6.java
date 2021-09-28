import java.util.ArrayList;

public class Ex6 {

    public static void minimumBribes(ArrayList<Integer> q) {
        int[] bribe = new int[q.size() + 1];
        int count = 0;
        boolean end = false;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = q.size() - 1; i > 0; i--) {
                if (q.get(i) < q.get(i - 1)) {
                    int temp = q.get(i);
                    q.set(i, q.get(i - 1));
                    q.set(i - 1, temp);
                    count++;
                    bribe[q.get(i)]++;
                    isSorted = false;
                }
                if (bribe[q.get(i)] > 2) {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        ArrayList<Integer> q = new ArrayList<Integer>();
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(3);
        q.add(4);
        minimumBribes(q);
    }
}
