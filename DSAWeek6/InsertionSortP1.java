import java.util.ArrayList;
import java.util.List;

public class InsertionSortP1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        boolean sorted = false;
        int num = arr.get(n - 1);

        for (int i = n - 1; i > 0; i--) {
            if (arr.get(i - 1) > num) {
                arr.set(i, arr.get(i - 1));
            } else {
                arr.set(i, num);
                sorted = true;
            }
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
            if (sorted) return;
        }
        arr.set(0, num);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
