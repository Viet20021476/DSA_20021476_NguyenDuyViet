import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MergeSort {
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, a.length - 1);

        int min = Math.abs(a[1] - a[0]);

        for (int i = 1; i < a.length - 1; i++) {
            if (Math.abs(a[i + 1] - a[i]) < min) {
                min = Math.abs(a[i + 1] - a[i]);
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (Math.abs(a[i + 1] - a[i]) == min) {
                result.add(a[i]);
                result.add(a[i + 1]);
            }
        }

        for (Integer res : result) {
            System.out.print(res + " ");
        }
    }
}