package Lesson3.AbstractShapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        this.numberOfSides = 1;
        this.shapeType = "circle";
        this.radius = r;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}