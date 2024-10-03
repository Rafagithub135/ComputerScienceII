package Lesson3.MovingObjects;

public class Motorcycle extends MotorVehicle {
    double speed = 0;

    public Motorcycle() {
        this.numberOfWheels = 2;
    }

    public void accelerate(double time) {
        this.speed += 30 * time;
    }

    public void decelerate(double time) {
        this.speed -= 30 * time;
    }

    public double getSpeed() {
        return this.speed;
    }

}