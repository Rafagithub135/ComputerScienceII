package Lab2;

public class Dice26 extends Main {
    public static void main(String[] args) {
        roll();
    }

    public static int roll() {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        System.out.print("You rolled a " + dice1);
        System.out.println(" and a " + dice2);
        return dice1 + dice2;
    }
}
