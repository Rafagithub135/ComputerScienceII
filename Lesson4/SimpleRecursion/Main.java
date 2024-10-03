package Lesson4.SimpleRecursion;

public class Main {

    public static void countDown(int n) {
        if (n == -1) {
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("MAIN STARTS");
        countDown(5);
    }
}