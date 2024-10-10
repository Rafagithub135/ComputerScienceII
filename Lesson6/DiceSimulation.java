package Lesson6;

import java.util.Random;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class DiceSimulation {
    public static void main(String[] args) {
        int[] data = new int[11];
        int rolls = 1_000_000;
        
        for (int i = 0; i < rolls; i++) {
            int index = roll() - 2;
            data[index]++;
        }

        try {
            File outputFile = new File("data.csv");
            PrintWriter fileWriter = new PrintWriter(outputFile);
            fileWriter.write("roll,occurences\n");
            for (int i = 0; i < data.length; i++) {
                fileWriter.write((i + 2) + "," + data[i] + "\n");
            }
            fileWriter.close();
        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }

    }
    
    public static void printArray(int[] values) {
        System.out.println();
        for (int i : values) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static int roll() {
        Random r = new Random();
        return r.nextInt(6) + r.nextInt(6) + 2;
    }
}
