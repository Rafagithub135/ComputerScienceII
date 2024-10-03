package Lesson3.SquarePolymorphism;

public class Rectangle {
    private int sides = 4;
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    public double area() {
        return this.length * this.height;
    }

    public double perimeter() {
        return 2 * (this.length + this.height);
    }

    public String toString() {
        return String.format("This is a rectangle with a length of %.2f and a height of %.2f", this.getLength(), this.getHeight());
    }
}