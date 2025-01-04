public class Recursion {
    public static void main(String[] args) {
        countDown(20);
        recSumTail(new int[] {1, 2, 3, 4, 5}, 0, 0);
    }

    public static void countDown(int n) {
        if (n == 0) {
            System.out.println("Happy New Year!");
        } else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    public static int recSumTail(int arr[], int i, int sum) {
        if (i == arr.length) {
            return sum;
        } else {
            return recSumTail(arr, i + 1, sum + arr[i]);
        }
    }
}
