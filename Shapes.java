import java.awt.*;


public abstract class Shapes {

public static void main(String[] args) {
    Point blank;
    blank = new Point(3,4);
    System.out.println("X coordinate: " + blank.x);
    System.out.println("Y coordinate: " + blank.y);
    System.out.println(blank.x + ", " + blank.y);
    int sum = blank.x * blank.x + blank.y * blank.y;
    System.out.println(sum);
}

    protected int numberOfSides;
    protected String shapeName;

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getArea(double length, double height);
}
