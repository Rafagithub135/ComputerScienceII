package Lab2;

import java.util.Random;

public class DeckStandard extends Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();

        Card[] hand = new Card[1];

        for (int i = 0; i < 1; i++) {
            hand[i] = d.dealCard();
        }

        for (Card c : hand) {
            System.out.println(c);
        }
    }
}