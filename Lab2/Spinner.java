package Lab2;

public class Spinner {
    public static void main(String[] args) {
        spin();
    }

    public static int spin() {
        int spinner = (int) (Math.random() * 12) + 1;
        System.out.println("You spun a " + spinner + ".");
        return spinner;
    }
}
