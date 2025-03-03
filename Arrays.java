import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

    }

    public static void printArray(int[] values) {
        System.out.println();
        for (int i : values) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void fillArrayWithRandomInts(int[] values) {
        Scanner valuesAmount = new Scanner(System.in);
        System.out.println("Enter the amount of values you want to generate: ");
        valuesAmount.nextInt();
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(valuesAmount.nextInt());
        }
    }
}