package Lesson1;

public class Square {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getPerimeter() {
        // double perimeter = this.length * 4;
        // return perimeter;
        return this.length * 4;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public String toString() {
        return String.format("This is a square with a side length of %.2f and an area of %.2f It's perimiter is %.2f", this.length, this.getArea(), this.getPerimeter());
    }
}