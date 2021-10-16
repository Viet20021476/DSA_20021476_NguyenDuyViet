import java.util.ArrayList;
import java.util.List;

public class InsertionSortP2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j) < arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
            }
            if (i > 0) {
                for (int k : arr) {
                    System.out.print(k + " ");
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(3);
        a.add(5);
        a.add(6);
        a.add(2);
        insertionSort2(a.size(), a);
    }
}
