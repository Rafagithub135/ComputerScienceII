package HackLabs.Module12;

import java.util.Random;

/**
 * Demonstrates the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * Main Method.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        // Creates a variable to store the current date.
        String date = "The start date is:  " + java.time.LocalDate.now();
        // Creates a variable to store the current time at the beginning of the sort.
        String startTime = "" + java.time.LocalTime.now();
        // Prints the date of the sort.
        System.out.println(date);
        // Prints the time the sort begins.
        System.out.println("The start time is:  " + startTime);
        // Creates an array of integers.  The number of integers is the number inside the square brackets.
        int[] numbers = new int[10000];

        // Fills the array with random numbers between 1 and the number inside the parentheses after the r.nextInt() method.
        Random r = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100) + 1;
        }

        // Prints the unsorted array
        System.out.println("Unsorted Array:");
        printArray(numbers);
        // Calls the bubbleSort method.
        bubbleSort(numbers);

        // Prints the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);
        // Creates a variable to store the current date at the end of the sort.
        String endDate = "The end date is:  " + java.time.LocalDate.now();
        System.out.println(endDate);
        // Creates a variable to store the current time at the end of the sort.
        String endTime = "" + java.time.LocalTime.now();
        // Prints the time the sort ends.
        System.out.println("The end time is:  " + endTime);
        System.out.println("The time to run this sort is:  " + endTime.compareTo(startTime) + " milliseconds.");
    }

    /**
     * Bubble Sort Algorithm.
     * @param a - The array to sort.
     */
    public static void bubbleSort(int[] a) {
        boolean exit = true;
        for(int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length; j++) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    exit = false;
                }
            }
            if (exit) {
                break;
            }
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