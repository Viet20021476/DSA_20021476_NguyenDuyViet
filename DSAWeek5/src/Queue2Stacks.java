import java.util.Scanner;
import java.util.Stack;

public class Queue2Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                int num = scanner.nextInt();
                stack1.push(num);
            } else if (choice == 2) {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                stack2.pop();
            } else if (choice == 3) {
                if (!stack2.isEmpty()) {
                    System.out.println(stack2.peek());
                } else {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                    System.out.println(stack2.peek());
                }
            }
        }
    }
}
