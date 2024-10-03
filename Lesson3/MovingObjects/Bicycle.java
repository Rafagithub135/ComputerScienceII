package Lesson3.MovingObjects;

public class Bicycle implements Acceleratable {
    int numberOfGears;
    String type;
    double currentSpeed = 0;

    public void accelerate(double time) {
        this.currentSpeed += time * 1;
    }

    public void decelerate(double time) {
        this.currentSpeed -= time * 5;
    }

    public double getSpeed() {
        return this.currentSpeed;
    }
}