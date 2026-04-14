package HackLabs.Module12;

import java.util.Random;

/**
 * Demonstrates an alternative implementation of the
 * Bubble Sort algorithm.
 */
public class BubbleSortAlt {

    /**
     * Main Method.
     * @param args - Command line arguments.
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];

        //Fills the array with random numbers between 1 and 100
        Random r = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100) + 1;
        }

        //Prints the unsorted array
        System.out.println("Unsorted Array:");
        printArray(numbers);

        bubbleSort(numbers);

        //Prints the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);

    }

    /**
     * Bubble Sort Algorithm with early termination.
     * @param a - The array to sort.
     */
    public static void bubbleSort(int[] a) {
        boolean sorted;
        do {
            //Assumes it is sorted
            sorted = true;
            for(int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]) {
                    //Makes a swap, it was not sorted
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
            //If sorted is still true, there were no swaps, meaning the data
            //is in order. No need to iterate through the array again.
        } while(!sorted);
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