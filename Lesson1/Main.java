package Lesson1;

class Main {
    public static void main(String[] args) {
        Square s1 = new Square(100.0);
        Square s2;
        s2 = new Square(10.0);
        System.out.println(s1.getLength());
        System.out.println(s2.getLength());

        // System.out.println("Square one has an area of " + s1.getArea());
        // System.out.println("Square one has a perimeter of " + s1.getPerimeter());
        // System.out.println("Square two has an area of " + s2.getArea());
        // System.out.println("Square two has a perimeter of " + s2.getPerimeter());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}