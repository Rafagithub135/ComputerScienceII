package Lesson3.SquarePolymorphism;

public class Square extends Rectangle  {
    public Square(double length) {
        super(length, length);
    }

    public String toString() {
        return String.format("This is a square with side length of %.2f", this.getHeight());
    }
}