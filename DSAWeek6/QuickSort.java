import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
    public static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;

        while (true) {
            while (a[++i] < a[lo]) {
                if (i == hi) break;
            }
            while (a[lo] < a[--j]) {
                if (j == lo) break;
            }
            if (i >= j) break;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        int temp = a[lo];
        a[lo] = a[j];
        a[j] = temp;
        return j;
    }

    public static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        quickSort(a, lo, j - 1);
        quickSort(a, j + 1, hi);
    }

    public static void main(String[] args) {
        In in = new In("C:\\Users\\Admin\\Downloads\\algs4-data\\algs4-data\\32Kints.txt");
        int[] a = new int[5000];
        for (int i = 0; i < 5000; i++) {
            a[i] = 100000;
        }

        /*ArrayList<Integer> a1 = new ArrayList<Integer>();
        for (int k : a) {
            a1.add(k);
        }
        Collections.sort(a1, Collections.reverseOrder());

        for(int i = 0; i < a.length; i++) {
            a[i] = a1.get(i);
        }*/

        final long start = System.currentTimeMillis();
        quickSort(a, 0, a.length - 1);
        final long end = System.currentTimeMillis();
        System.out.println(end - start);

        for (int c : a) {
            System.out.println(c);
        }
    }
}
