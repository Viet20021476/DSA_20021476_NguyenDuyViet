import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int count = 0;
        boolean check = false;
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            count++;
            if (uf.find(p) != uf.find(q)) {
                uf.union(p, q);
            } else continue;
            if(uf.count() == 1) {
                StdOut.println(count);
                check = true;
                break;
            }
        }
        if(!check) StdOut.println("FAILED");
    }
}