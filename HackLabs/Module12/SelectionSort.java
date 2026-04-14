package HackLabs.Module12;

import java.util.Random;

/**
 * Demonstrates the Selection Sort algorithm.
 */
public class SelectionSort {

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

        selectionSort(numbers);

        //Prints the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);

    }

    /**
     * Selection Sort Algorithm.
     * @param a - The array to sort.
     */
    public static void selectionSort(int[] a) {
        for(int i = 0; i < a.length-1; i++) {
            int smallest = i;
            for(int j = i+1; j < a.length; j++) {
                if(a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            if(smallest != i) {
                int temp = a[smallest];
                a[smallest] = a[i];
                a[i] = temp;
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