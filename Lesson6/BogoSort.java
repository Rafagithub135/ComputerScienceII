package Lesson6;

import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        int arraySize = 12;
        int[] theData= new int[arraySize];
        fillArrayWithRandomInts(theData);
        printArray(theData);
        sort(theData);
        printArray(theData);
    }

    public static void sort(int[] values) {
        while (!isSorted(values)) {
            shuffle(values);
        }
    }

    public static void fillArrayWithRandomInts(int[] values) {        
        Random rand = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(1_000_000);
        }
    }

    public static void printArray(int[] values) {
        System.out.println();
        for (int i : values) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void shuffle(int[] values) {
        /**
         *  Implement the Fisher Yates Shuffle
         *  https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
         */
        Random rand = new Random();
        for (int i = values.length - 1; i >= 1; i--) {
            int j = rand.nextInt(i + 1);
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
    }

    public static boolean isSorted(int[] values) {
        if (values.length <= 1) {
            return true;
        }
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[i - 1]) {
                return false;
            }
        }
        return true;        
    }
}