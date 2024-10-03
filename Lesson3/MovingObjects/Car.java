package Lesson3.MovingObjects;

public class Car extends MotorVehicle {
    double currentSpeed = 0;

    public Car() {
        this.numberOfWheels = 4;
    }

    public void accelerate(double time) {
        this.currentSpeed += 10 * time;
    }

    public void decelerate(double time) {
        this.currentSpeed -= 15 * time;
    }

    public double getSpeed() {
        return this.currentSpeed;
    }
}