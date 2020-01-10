import java.util.ArrayList;

public class Combat extends Encounter {
    ArrayList<Square> squares;

    public Combat(Stats stats, int exp, String name, ArrayList<Square> squares) {
        super(stats, exp, name);
        this.squares = squares;
    }
}
