import java.util.ArrayList;

/**
 * This class represents the full deck of cards. No sense in having the discard pile be a separate class, so this will include that, too
 *
 * I can either initialize the cards in the deck by giving the constructor input, or I can do it directly in the constructor.
 * The former seems safer
 *
 * */

public class Deck {
    private ArrayList<Card> dk;

    public Deck() {
    }

    public Card draw() {
        return dk.remove(dk.size() - 1);
    }
}
