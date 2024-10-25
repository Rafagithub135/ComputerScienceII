package Lab2;

public class Deck40Norm extends Main {
    public static void main(String[] args) {
        draw();
    }

    public static String draw() {
        int number = (int) (Math.random() * 10);
        System.out.println(number);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        if (number == 1) {
            System.out.println("You drew the Ace of " + suits[(int) (Math.random() * 4)]);
            return "Ace of " + suits[(int) (Math.random() * 4)];
        }
        System.out.println("You drew the " + values[number] + " of " + suits[(int) (Math.random() * 4)]);
        return values[number] + suits[(int) (Math.random() * 4)];
    }
}