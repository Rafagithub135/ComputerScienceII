package HackLabs.Module10.Module10.SampleCode;

import java.util.Scanner;

public class Sample {
    public static void main() {
        Scanner f = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int n = f.nextInt();
        factorial(n);
    }

    public static int factorial(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("A factorial number must be positive.  Please enter a positive number.");
        } else if (n == 0) {
            return 1;
        } else
            for(int i = n; i >= 0; i--) {
                System.out.println(result);
            result *= i;
        }
        return result;
    }
}