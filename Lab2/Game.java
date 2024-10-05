package Lab2;

public class Game {
    private Player player1;
    private Player player2;
    private Deck deck;

    public Game() {
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
        this.deck = new Deck();
        this.deck.shuffle();
    }

    public void play() {
        for (int i = 0; i < 5; i++) {
            this.player1.addCard(this.deck.dealCard());
            this.player2.addCard(this.deck.dealCard());
        }

        System.out.println("Player 1's hand:");
        this.player1.showHand();
        System.out.println("Player 2's hand:");
        this.player2.showHand();

        int player1Score = this.player1.getScore();
        int player2Score = this.player2.getScore();

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.play();
    }
}
