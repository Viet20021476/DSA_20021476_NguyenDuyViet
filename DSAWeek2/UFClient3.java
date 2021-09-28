import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Collections;

import static edu.princeton.cs.algs4.StdIn.readInt;

public class UFClient3 {
    public static void main(String[] args) {
        int n;
        n = StdIn.readInt();
        ArrayList<Integer> a = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            a.add(StdIn.readInt());
        }
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            int check = bnSearch(a, i, a.size() - 1, -a.get(i));
            if (check != -1) {
                StdOut.println(a.get(i) + " " + a.get(check));
            }
        }
    }

    public static int bnSearch(ArrayList<Integer> a, int bgIndex, int enIndex, int x) {
        if (enIndex >= bgIndex) {
            int mid = (bgIndex + enIndex) / 2;

            if (a.get(mid) == x) return mid;
            if (a.get(mid) > x) return bnSearch(a, bgIndex, mid - 1, x);
            if (a.get(mid) < x) return bnSearch(a, mid + 1, enIndex, x);
        }

        return -1;
    }
}
