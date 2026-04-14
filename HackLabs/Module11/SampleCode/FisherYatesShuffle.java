package HackLabs.Module11.SampleCode;

import java.util.Random;

public class FisherYatesShuffle {

    /**
     * Main Method.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 15, 18, 24, 31, 45, 67, 82};

        //Prints the sorted array
        printArray(numbers);

        shuffle(numbers);

        //Prints the shuffled array
        printArray(numbers);
    }

    /**
     * Shuffles an array using the Fisher-Yates algorithm.
     * @param a - The array to shuffle
     */
    public static void shuffle(int[] a) {
        Random r = new Random();
        for(int i = 1; i < a.length; i++) {
            int j = r.nextInt(i+1);                     //Random number between 0 and i (inclusive, hence the +1)
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }

    /**
     * Prints the contents of an array of integers.
     * @param a - Array to print.
     */
    public static void printArray(int[] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}