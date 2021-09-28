import java.util.Arrays;

public class Ex4 {
    public static String closestNumbers(int[] a) {
        int min = Math.abs(a[1] - a[0]);

        for (int i = 1; i < a.length - 1; i++) {
            if (Math.abs(a[i + 1] - a[i]) < min) min = Math.abs(a[i + 1] - a[i]);
        }
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < a.length - 1; i++) {
            if (Math.abs(a[i + 1] - a[i]) == min) {
                s.append(a[i]).append(" ").append(a[i + 1]).append(" ");
            }
        }
        return s.toString().toString();
    }

    public static void main(String[] args) {
        int[] a = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470};
        Arrays.sort(a);
        System.out.println(closestNumbers(a));
    }
}
