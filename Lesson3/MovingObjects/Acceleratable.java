package Lesson3.MovingObjects;

public interface Acceleratable {
    double getSpeed();
    void accelerate(double time);
    void decelerate(double time);
}