import java.util.ArrayList;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> characters = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                characters.push(c);
            } else if (c == '}') {
                if (characters.isEmpty() || characters.peek() != '{') {
                    return "NO";
                } else characters.pop();
            } else if (c == ']') {
                if (characters.isEmpty() || characters.peek() != '[') {
                    return "NO";
                } else characters.pop();
            } else if (c == ')') {
                if (characters.isEmpty() || characters.peek() != '(') {
                    return "NO";
                } else characters.pop();
            }
        }
        if (characters.isEmpty()) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        String s = "{{[[(())]]}}";
        System.out.println(isBalanced(s));
    }
}
