package Lab2;

public class Player {
    private String name;
    private Card[] hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new Card[5];
        this.score = 0;
    }

    public void addCard(Card c) {
        for (int i = 0; i < this.hand.length; i++) {
            if (this.hand[i] == null) {
                this.hand[i] = c;
                break;
            }
        }
    }

    public void showHand() {
        for (Card c : this.hand) {
            System.out.println(c);
        }
    }

    public int getScore() {
        for (Card c : this.hand) {
            this.score += c.getValue();
        }
        return this.score;
    }
}
