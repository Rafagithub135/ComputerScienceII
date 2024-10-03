package Lesson2.DeckOfCards;

public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();

        Card[] hand = new Card[5];

        for (int i = 0; i < 5; i++) {
            hand[i] = d.dealCard();
        }

        for (Card c : hand) {
            System.out.println(c);
        }

    }

}