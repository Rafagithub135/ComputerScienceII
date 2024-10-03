package Lesson3.SquarePolymorphism;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println(r1);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Square s1 = new Square(8);
        System.out.println(s1);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        System.out.println("-----");

        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = r1;
        shapes[1] = s1;
        shapes[2] = new Square(9);

        for (Rectangle s: shapes) {
            System.out.println(s);
            System.out.println(s.area());
        }

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println(shapes[i].area());
        }
    }
}