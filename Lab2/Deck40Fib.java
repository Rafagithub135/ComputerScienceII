package Lab2;

public class Deck40Fib extends Main {
    public static void main(String[] args) {
    draw();
}

    public static String draw() {
        int number = (int) (Math.random() * 10);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] values = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        System.out.println("You drew the " + values[number] + " of " + suits[(int) (Math.random() * 4)]);
        return values[number] + suits[(int) (Math.random() * 4)];
    }
}