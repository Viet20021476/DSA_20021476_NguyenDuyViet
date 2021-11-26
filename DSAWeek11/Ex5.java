import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Ex5 {
    /*public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        HashSet<Integer> b = new HashSet<>(brr);

        for (Integer i : b) {
            if (b.contains(i)) {
                brr.remove(i);
            }
        }
        Collections.sort(brr);

        for (int i = 0; i < brr.size(); i++) {
            if (brr.get(i).equals(brr.get(i + 1))) {
                brr.remove(brr.get(i + 1));
            }
        }
        return brr;
    }*/

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> missingNumbers = new ArrayList<>();
        Collections.sort(arr);
        Collections.sort(brr);

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < brr.size(); i += count1) {
            count1 = 0;
            count2 = 0;

            for (int j = 0; j < brr.size(); j++) {
                if (brr.get(i).equals(brr.get(j))) count1++;
            }

            for (int k = 0; k < arr.size(); k++) {
                if (brr.get(i).equals(arr.get(k))) count2++;
            }

            if (count1 != count2) missingNumbers.add(brr.get(i));
        }
        return missingNumbers;
    }
}
