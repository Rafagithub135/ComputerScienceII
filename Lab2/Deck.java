package Lab2;

import java.util.*;

public class Deck {
    private Card[] cards;
    private int topIndex = 0;

    public Deck() {
        this.cards = new Card[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int index = 0;
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                this.cards[index] = new Card(i, suit);
                index++;
            }
        }
    }

    void reset() {
        this.topIndex = 0;
        this.shuffle();
    }

    Card dealCard() {
        Card c = this.cards[this.topIndex];
        this.topIndex++;
        return c;
    }

    void shuffle() {
        Random rand = new Random();
        for (int i = this.cards.length - 1; i >= 1; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = this.cards[i];
            this.cards[i] = this.cards[j];
            this.cards[j] = temp;
        }
    }
}
