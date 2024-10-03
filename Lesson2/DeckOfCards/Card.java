package Lesson2.DeckOfCards;

public class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getColor() {
        if (this.suit.equals("Clubs") || this.suit.equals("Spades")) {
            return "black";
        } else {
            return "red";
        }
    }

    public String getFace() {
        if (this.value >= 2 && this.value <= 10) {
            return Integer.toString(this.value);
        } else if (this.value == 11) {
            return "J";
        } else if (this.value == 12) {
            return "Q";
        } else if (this.value == 13) {
            return "K";
        } else {
            return "A";
        }
    }

    public String toString() {
        return this.getFace() + " of " + this.getSuit();
    }
}