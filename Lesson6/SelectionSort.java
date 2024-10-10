package Lesson6;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int arraySize = 1000;
        int[] values = new int[arraySize];
        fillArrayWithRandomInts(values);
        printArray(values);
        selectionSort(values);
        printArray(values);
    }

    public static void printArray(int[] values) {
        System.out.println();
        for (int i : values) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void fillArrayWithRandomInts(int[] values) {        
        Random rand = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(1_000_000);
        }
    }

    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int minIndex = findIndexOfMinFromIndex(values, i);
            swapValuesAtIndexes(values, i, minIndex);
        }
    }

    public static int findIndexOfMinFromIndex(int[] values, int startIndex) {
        int currentMin = values[startIndex];
        int currentMinIndex = startIndex;
        
        for (int i = startIndex; i < values.length; i++) {
            
            if (values[i] < currentMin) {
                currentMin = values[i];
                currentMinIndex = i;
            }
        }
        return currentMinIndex;
    }

    public static void swapValuesAtIndexes(int[] values, int first, int second) {
        int temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
}
