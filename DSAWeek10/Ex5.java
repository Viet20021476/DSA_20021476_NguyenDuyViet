import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    void traverseInorder(Node root, List<Integer> a) {
        if (root != null) {
            traverseInorder(root.left, a);
            a.add(root.data);
            traverseInorder(root.right, a);
        }
    }

    boolean checkBST(Node root) {
        List<Integer> a = new ArrayList<Integer>();
        traverseInorder(root, a);

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) >= a.get(i + 1)) return false;
        }
        return true;
    }
}
