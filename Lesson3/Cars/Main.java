package Lesson3.Cars;

public class Main {
    public static void main(String[] args) {
        Car[] inventory = new Car[5];
        inventory[0] = new Car("Honda", "Accord", 4);
        inventory[1] = new Car("Toyota", "Tacoma", 4);
        inventory[2] = new Car("Mazda", "XR7", 2);
        inventory[3] = new ElectricCar("Ford", "Mustang", 2);
        inventory[4] = new ElectricCar("Chevy", "Volt", 4);

        for (Car c : inventory) {
            System.out.println(c.getVin());
            System.out.println(c);
        }
    }
}