import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
    public static void printTriple(ArrayList<Integer> a) {
        int bgIndex = 0;
        int enIndex = 0;

        for (int i = 0; i < a.size(); i++) {
            bgIndex = i + 1;
            enIndex = a.size() - 1;

            while (bgIndex < enIndex) {
                if (a.get(i) + a.get(bgIndex) + a.get(enIndex) == 0) {
                    System.out.println(a.get(i) + " " + a.get(bgIndex) + " " + a.get(enIndex));
                    break;
                } else if (a.get(i) + a.get(bgIndex) + a.get(enIndex) < 0) {
                    bgIndex++;
                } else {
                    enIndex--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        printTriple(a);

    }
}
