import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input.add(sc.next());
        }

        Collections.sort(input);
        boolean identical = true;
        int count = 1;

        for (int i = 0; i < input.size() - 1; i++) {
            if (!identical) count = 1;
            if (input.get(i).equals(input.get(i + 1))) {
                identical = true;
                count++;
            } else {
                identical = false;
                result.add(input.get(i) + " " + count);
            }
            if (i == input.size() - 2 && result.isEmpty()) {
                result.add(input.get(i) + " " + count);
            }

            if (i == input.size() - 2 && !identical) {
                result.add(input.get(i + 1) + " 1");
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
