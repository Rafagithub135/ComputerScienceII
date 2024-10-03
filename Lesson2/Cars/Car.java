package Lesson2.Cars;

public class Car {
    protected String make;
    protected String model;
    protected String vin;
    protected int doors;
    protected double range;

    public Car(String make, String model, int doors) {
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.range = 25.2;
    }

    public String toString() {
        return String.format("This is a %d door %s %s it gets %.2f miles per gallon", this.doors, this.make, this.model, this.range);
    }
}