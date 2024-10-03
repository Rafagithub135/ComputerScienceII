package Lesson2.Buildings;

public class Buildings {
    public static void main(String[] args) {
        Building b1 = new Building(4, 2);
        System.out.println(b1.walls + " " + b1.doors);
        House h1 = new House();
        System.out.println(h1.walls + " " + h1.doors + " " + h1.floors);
    }
}