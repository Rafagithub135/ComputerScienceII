package Project1;

public class Stats {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] arr3 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] arr4 = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        int[] arr5 = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};
        int[] arr6 = {100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};
        int[] arr7 = {1000000, 2000000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 9000000, 10000000};
        int[] arr8 = {10000000, 20000000, 30000000, 40000000, 50000000, 60000000, 70000000, 80000000, 90000000, 100000000};
        int arrayLength = 0;
        int[] number = new int[arrayLength];
        fillArrayWithRandomNumbers(number);
        printArray(number);
        sort(number);
        printArray(number);
    }

    public static void sort(int[] values) {
        while (!isSorted(values)) {
            shuffle(values);
        }
    }

    public static void fillArrayWithRandomNumbers(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 100);
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
        for (int i = values.length - 1; i >= 1; i--) {
            int j = (int) (Math.random() * (i + 1));
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
