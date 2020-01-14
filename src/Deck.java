import java.util.ArrayList;

/**
 * This class represents the full deck of cards. No sense in having the discard pile be a separate class, so this will include that, too
 *
 * I can either initialize the cards in the deck by giving the constructor input, or I can do it directly in the constructor.
 * The former seems safer
 *
 * */

public class Deck {
    private ArrayList<Card> dk, discard, field;

    public Deck() {
    }

    public Card draw() {
        return dk.remove(dk.size() - 1);
    }

    public void Discard(int count) {
        for(int x = 0; x < count; x++) {
            discard.add(dk.remove(dk.size() - 1));
            if(dk.size() == 0) {
                return;
            }
        }
    }

    public void explore(int limit) {

    }

    public void explore() {
        int limit = 4;
        for(int x = 0; x < limit; x++) {
            if(field.get(x) == null) {
                field.set(x, dk.get(dk.size() - 1));
            }
        }
    }

    public ArrayList<Card> getDk() {
        return dk;
    }

    public ArrayList<Card> getDiscard() {
        return discard;
    }

    public ArrayList<Card> getField() {
        return field;
    }
}
