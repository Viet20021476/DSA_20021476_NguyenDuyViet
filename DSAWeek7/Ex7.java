import java.util.List;

public class Ex7 {
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

    public static int findMedian(int[] a, int lo, int hi, int pos) {
        if (lo == hi) return a[hi];
        int j = partition(a, lo, hi);
        if (j == pos) return a[pos];
        else if (j > pos) return findMedian(a, lo, j - 1, pos);
        else return findMedian(a, j + 1, hi, pos);
    }

}


