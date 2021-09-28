public class Ex3 {
    public static String balancedSum(int[] a) {
        int sum = 0;
        int leftSum = 0;
        for (int el : a) {
            sum += el;
        }
        for (int el : a) {
            if (leftSum == sum - leftSum - el) {
                return "YES";
            }
            leftSum += el;
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(balancedSum(a));
    }
}
