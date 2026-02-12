package HackLabs.Lab4;

import java.util.Scanner;
import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        String cities;
        int population;

        Scanner keyboard = new Scanner(System.in);

        City[] locale = new City[3];

        System.out.println("Enter 10 cities:  ");

        for (int i = 0; i < locale.length; i++) {

            System.out.println("Enter a city name:  ");

            cities = keyboard.nextLine();

            System.out.println("Enter the population of the city:  ");

            population = Integer.parseInt(keyboard.nextLine());

            locale[i] = new City(cities, population);
        }

        FileOutputStream outStream = null;
        ObjectOutputStream objectOutputFile = null;

        try {
            outStream = new FileOutputStream("C:\\CSCI\\CityObjects.dat");
            objectOutputFile = new ObjectOutputStream(outStream);

            for (int i = 0; i < locale.length; i++) {
                objectOutputFile.writeObject(locale[i]);
            }
        } catch (IOException e) {
            System.out.println("There is a problem writing to the file.");
            System.out.println(e.getMessage());
        } finally {
            try {
                objectOutputFile.close();
            } catch (IOException e) {

            }
            System.out.println("The serialized objects were written to the CityObjects.dat file.");
        }
    }
}