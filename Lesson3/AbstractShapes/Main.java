package Lesson3.AbstractShapes;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(1, 3);
        Rectangle r1 = new Rectangle(4, 6);

        Shape s2 = new Circle(2);
        Circle c1 = new Circle(4);

        // s2.numberOfSides = 100; // BAD!

        Shape[] shapes = new Shape[4];
        shapes[0] = s1;
        shapes[1] = r1;
        shapes[2] = s2;
        shapes[3] = c1;

        for (Shape s: shapes) {
            System.out.println(s.getShapeType());
            System.out.println(s.getPerimeter());
            System.out.println(s.getArea());
            System.out.println("-----");
        }
    }

}