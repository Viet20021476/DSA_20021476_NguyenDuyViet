import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {
    public static void merge(int[] a, int lo, int mid, int hi) {
        int[] aux = new int[a.length];
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
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
        mergeSort(a, 0, a.length - 1);
        final long end = System.currentTimeMillis();
        System.out.println(end - start);

        for (int c : a) {
            System.out.println(c);
        }
    }
}
