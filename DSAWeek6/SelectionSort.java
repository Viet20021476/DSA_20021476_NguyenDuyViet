import edu.princeton.cs.algs4.In;

public class SelectionSort {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min_index = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        In in = new In("C:\\Users\\Admin\\Downloads\\algs4-data\\algs4-data\\32Kints.txt");
        int[] a = in.readAllInts();

        final long start = System.currentTimeMillis();
        selectionSort(a);
        final long end = System.currentTimeMillis();
        System.out.println(end - start);

        for (int c : a) {
            System.out.println(c);
        }
    }

}
