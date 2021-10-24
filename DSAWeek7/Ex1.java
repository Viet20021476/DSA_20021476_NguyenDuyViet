import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static int binarySearch(List<Integer> arr, int l, int r, int V) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) < V) {
                return binarySearch(arr, mid + 1, r, V);
            } else if (arr.get(mid) > V) {
                return binarySearch(arr, l, mid - 1, V);
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static int introTutorial(int V, List<Integer> arr) {
        return binarySearch(arr, 0, arr.size() - 1, V);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(12);
        System.out.println(introTutorial(4, arr));

    }

}
