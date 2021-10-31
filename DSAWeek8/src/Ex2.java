import java.util.Scanner;

public class Ex2 {

    public static String checkPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(checkPalindrome(s));
    }
}
