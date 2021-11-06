import java.util.HashSet;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        HashSet<String> hashSet = new HashSet<String>();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            hashSet.add(s);
            System.out.println(hashSet.size());
        }
    }
}
