import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {
    public static int partition(List<Integer> a, int lo, int hi) {
        int pivot = a.get(hi);
        int i = lo - 1;

        for (int j = lo; j <= hi; j++) {
            if (a.get(j) <= pivot) {
                i++;
                int temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
            }
        }

        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        return i;
    }

    public static void quickSort(List<Integer> a, int lo, int hi) {
        if (lo >= 0 && hi >= 0 && lo < hi) {
            int p = partition(a, lo, hi);
            quickSort(a, lo, p - 1);
            quickSort(a, p + 1, hi);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> a = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        quickSort(a, 0, a.size() - 1);
    }
}
