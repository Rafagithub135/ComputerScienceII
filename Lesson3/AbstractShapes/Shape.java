package Lesson3.AbstractShapes;

public abstract class Shape {
    protected int numberOfSides;
    protected String shapeType;

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public String getShapeType() {
        return this.shapeType;
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}