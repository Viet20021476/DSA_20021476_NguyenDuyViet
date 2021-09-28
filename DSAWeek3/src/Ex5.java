import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex5 {

    public static int pairs(int k, ArrayList<Integer> arr) {
        int numOfPairs = 0;
        int i = 0;
        int j = 1;
        Collections.sort(arr);

        while (j < arr.size()) {
            int difference = arr.get(j) - arr.get(i);
            if (difference > k) {
                i++;
            } else if (difference < k) {
                j++;
            } else {
                numOfPairs++;
                j++;
            }
        }
        return numOfPairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(pairs(1, arr));
    }
}
