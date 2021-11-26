import java.util.HashSet;
import java.util.List;

public class Ex4 {
    public static int pairs(int k, List<Integer> arr) {
        HashSet<Integer> h = new HashSet<Integer>(arr);
        int numOfPairs = 0;

        for (Integer i : h) {
            if (h.contains(i + k)) {
                numOfPairs++;
            }
        }
        return numOfPairs;
    }
}
