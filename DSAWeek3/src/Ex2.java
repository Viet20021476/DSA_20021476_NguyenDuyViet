import java.util.Arrays;

public class Ex2 {
    public static int binarySearch(int[] a, int number) {
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int mid = (r - l) / 2;
            if (number < a[mid]) {
                r--;
            } else if (number > a[mid]) {
                l++;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (10 - 0 + 1) + 0);
        }
        Arrays.sort(a);
        for (int t : a) {
            System.out.print(t + " ");
        }
        System.out.println(binarySearch(a, 5));
    }
}
