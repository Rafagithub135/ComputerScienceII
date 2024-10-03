package Lesson4.ProgramFlow;

public class Main {
    public static void c() {
        int a = 10;
        System.out.println("C STARTS");
        System.out.println("C ENDS");
    }

    public static void b() {
        int a = 20;
        System.out.println("B STARTS");
        c();
        System.out.println("B ENDS");
    }

    public static void a() {
        int a = 30;
        System.out.println("A STARTS");
        b();
        System.out.println("A ENDS");
    }

    public static void main(String[] args) {
        int a = 40;
        System.out.println("MAIN STARTS");
        a();
        System.out.println("MAIN ENDS");
    }
}