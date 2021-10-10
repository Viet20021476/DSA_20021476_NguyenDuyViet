import java.util.Scanner;
import java.util.Stack;

public class TextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Stack<String> operations = new Stack<String>();
        operations.push(s.toString());

        for (int i = 0; i < q; i++) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                String temp = scanner.next();
                s.append(temp);
                operations.push(s.toString());
            } else if (choice == 2) {
                int k = scanner.nextInt();
                s = new StringBuilder(s.substring(0, s.length() - k));
                operations.push(s.toString());
            } else if (choice == 3) {
                int k = scanner.nextInt();
                result.append(s.charAt(k - 1)).append("\n");
            } else if (choice == 4) {
                operations.pop();
                s = new StringBuilder(operations.peek());
            }
        }
        System.out.println(result);
    }
}
