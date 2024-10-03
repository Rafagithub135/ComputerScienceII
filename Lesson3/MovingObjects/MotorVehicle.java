package Lesson3.MovingObjects;

public abstract class MotorVehicle implements Acceleratable {
    int numberOfWheels;
    String transmission;
    String motorType;
    double range;
    double currentSpeed = 0;
}