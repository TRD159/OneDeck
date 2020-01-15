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
        dk = new ArrayList<>();
        discard = new ArrayList<>();
        field = new ArrayList<Card>() {
            {
                add(null);
                add(null);
                add(null);
                add(null);
            }
        };

        //System.out.println(field.size());


        dk.add(new Combat(1, 1, 1, 1, 1, "Placeholder", new ArrayList<Square>() {
            {
                add(new Square(true, 0, 0, Color.BLUE, 1, false));
                add(new Square(true, 0, 0, Color.YELLOW, 1, false));
            }
        }));
        dk.add(new Combat(1, 1, 1, 1, 1, "Placeholder", new ArrayList<Square>() {
            {
                add(new Square(true, 0, 0, Color.BLUE, 1, false));
            }
        }));

        dk.add(new Combat(1, 1, 1, 1, 1, "Placeholder", new ArrayList<Square>() {
            {
                add(new Square(true, 0, 0, Color.BLUE, 1, false));
                add(new Square(true, 0, 0, Color.YELLOW, 1, false));
            }
        }));
        dk.add(new Combat(1, 1, 1, 1, 1, "Placeholder", new ArrayList<Square>() {
            {
                add(new Square(true, 0, 0, Color.BLUE, 1, false));
            }
        }));

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
            System.out.println("start");
            if(dk.isEmpty()) {
                //System.out.println("false");
                return;
            }
            if(field.get(x) == null) {
                //System.out.println("true");
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
