package Lesson4.RecursiveSum;

public class Main {

    public static int sum(int n) {
        if (n > 1) {
            return n + sum(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("MAIN STARTS");
        System.out.println(sum(5));
    }
}