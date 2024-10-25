package Lab2;

public class PairDiceFibonacci extends Main {
    public static void main(String[] args) {
    }

    public static int roll() {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < 8; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        int dice1 = (int) (Math.random() * 10) + 1;
        int dice2 = (int) (Math.random() * 10) + 1;
        System.out.print("You rolled a " + dice1);
        System.out.println(" and a " + dice2);
        return numbers[dice1] + numbers[dice2];
    }



}
