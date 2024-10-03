package Lesson3.Cars;

import java.util.Random;

public class Car {
    protected String make;
    protected String model;
    protected String vin;
    protected int doors;
    protected double range;

    public Car(String make, String model, int doors) {
        Random r = new Random();
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.range = 25.2;
        this.vin = this.model + Integer.toString(r.nextInt(100));
    }

    public String getVin() {
        return this.vin;
    }

    public String toString() {
        return String.format("This is a %d door %s %s it gets %.2f miles per gallon", this.doors, this.make, this.model, this.range);
    }
}