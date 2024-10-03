package Lesson3.AbstractShapes;

public class Rectangle extends Shape {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.numberOfSides = 4;
        this.shapeType = "rectangle";
        this.length = length;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.height);
    }

    public double getArea() {
        return this.length * this.height;
    }
}