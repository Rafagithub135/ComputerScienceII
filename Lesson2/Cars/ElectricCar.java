package Lesson2.Cars;

public class ElectricCar extends Car {
    public ElectricCar(String make, String model, int doors) {
        super(make, model, doors);
        this.range = 300;
    }

    public String toString() {
        return String.format("This is a %d door %s %s it gets %.2f miles per charge.", this.doors, this.make, this.model, this.range);
    }
}