package Lesson3.MovingObjects;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Motorcycle m1 = new Motorcycle();
        Bicycle b1 = new Bicycle();

        Acceleratable[] raceTrack = new Acceleratable[3];
        raceTrack[0] = c1;
        raceTrack[1] = m1;
        raceTrack[2] = b1;

        for (Acceleratable v: raceTrack) {
            System.out.println(v.getSpeed());
            v.accelerate(10);
            System.out.println(v.getSpeed());
            v.decelerate(2);
            System.out.println(v.getSpeed());
        }
    }
}