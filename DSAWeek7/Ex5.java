import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else if (arr.get(i) > pivot) {
                right.add(arr.get(i));
            }
        }
        result.addAll(left);
        result.add(pivot);
        result.addAll(right);
        return result;
    }

}
