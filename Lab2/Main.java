package Lab2;

public class Main {
    public static void main(String[] args) {

//        Game game1 = new Game(Dice26);
//        Game game2 = new Game(Spinner);
//        Game game3 = new Game(DeckStandard);
//        Game game4 = new Game(PairDiceFibonacci);
//        Game game5 = new Game(Deck40Norm);
//        Game game6 = new Game(Deck40Fib);
//        TODO:  Many different games use some sort of physical randomizer. Examples include, dice, spinners, and shuffled cards. Each of these has different probabilities of turning up the different values that they produce. For example, a spinner with the numbers from one (1) through (12) will produce a very different statistical distribution of values than two (2) six-sided dice.
//
//For this lab imagine that you are producing a program that has a catalog of simple games that can be played. Each of the different games will use a different type of randomizer. Each randomizer could be used in a number of different games, so it makes sense to create a separate class. But the randomizers used in the various games could also be swapped out depending on the configuration of the game. That means that each game will need to be able to rely on the same methods and properties of objects (instances) of the randomizer class. Such a task is a good case for either an abstract class or an interface.
//
//You will need to use composition of objects as well as inheritance, overriding properties and methods, and abstract classes or interfaces to create the various randomizers. The randomizers you must create are:
//
//A pair of six-sided dice.
//A spinner with 12 values numbered 1-12.
//A standard deck of cards (see my example).
//A pair of 10 sided dice with Fibonacci numbers... 1, 1, 2, 3, 5, 8, ...
//A deck of cards with 40 numbered cards. Four sets of 1-10.
//A deck of cards with 40 numbered cards. Four sets of the first 10 Fibonacci numbers.
//Importantly, each randomizer should behave (generate values) that are similar to the real-world physical randomizer. Think about the statistical properties of these various randomizers. What would you see if you pulled 40 values from each one of these? What about 52?
//
//All randomizers must be able to be used infinitely. That means, that in a game that uses cards, after all the cards are exhausted, the cards would be collected and then shuffled for use again. The game should not worry about this behavior, it is the randomizer's responsibility to always return a value.
//
//Create at least 6 classes, one for each randomizer. You will likely also create others When instantiating a game you will pass a single argument to the game's constructor function. This argument will be a object that is either derived from (extends) an abstract randomizer class or implements the randomizer interface. The class or interface name should be "Randomizer".
//
//On the "Game" class create a method called "takeTurn". In a real world scenario, this would allow the user to get a random value from the randomizer and then move them according to the game rules based on the value produced by the randomizer. We will simply use this method to call to the randomizer to get a value and return it. In short the "takeTurn" method will be a passthrough the value returned by our randomizer.
//
//Once the classes are created, create a "Main" class with a "main" method. Within "main", create six (6) Randomizer instances and six Game objects (the randomizers need to be created first so they can be passed to the game constructors). Once you have game objects, call the "takeTurn" method on each of the games five (5) times to see what values are created.
//
//In addition to the working code, I want you to produce UML diagrams that show the relationships of the various classes.

        // Create randomizers
//        Randomizer dice = new Dice();
//        Randomizer spinner = new Spinner();
//        Randomizer deckOfCards = new DeckOfCards();
//        Randomizer fibonacciDice = new FibonacciDice();
//        Randomizer deckOfCards1To10 = new DeckOfCards1To10();
//        Randomizer deckOfCardsFibonacci = new DeckOfCardsFibonacci();

        // Create games


        // Call takeTurn method on each game 5 times
        for (int i = 0; i < 5; i++) {
//            System.out.println("Game 1: " + game1.takeTurn());
//            System.out.println("Game 2: " + game2.takeTurn());
//            System.out.println("Game 3: " + game3.takeTurn());
//            System.out.println("Game 4: " + game4.takeTurn());
//            System.out.println("Game 5: " + game5.takeTurn());
//            System.out.println("Game 6: " + game6.takeTurn());
        }
    }
}
