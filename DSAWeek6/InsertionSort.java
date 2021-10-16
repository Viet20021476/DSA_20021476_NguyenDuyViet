import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        //In in = new In("C:\\Users\\Admin\\Downloads\\algs4-data\\algs4-data\\32Kints.txt");
        int[] a = new int[50000];
        for (int i = 0; i < 50000; i++) {
            a[i] = 10000;
        }
        /*ArrayList<Integer> a1 = new ArrayList<Integer>();
        for (int k : a) {
            a1.add(k);
        }
        Collections.sort(a1,Collections.reverseOrder());

        for(int i = 0; i < a.length; i++) {
            a[i] = a1.get(i);
        }*/

        final long start = System.currentTimeMillis();
        insertionSort(a);
        final long end = System.currentTimeMillis();
        System.out.println(end - start);

        /*for (int c : a) {
            System.out.println(c);
        }*/
    }
}
