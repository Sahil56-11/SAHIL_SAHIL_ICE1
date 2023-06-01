package Card;

/**
 * A class that models playing card objects. Cards have a value
 * (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * and a suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * 
 * Modified by: [Your Name]
 */
public class Card {

    private final String suit; // clubs, spades, diamonds, hearts
    private final int value; // 1-13

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
