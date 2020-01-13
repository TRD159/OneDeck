import java.util.ArrayList;

public class Combat extends Encounter {
    ArrayList<Square> squares;

    public Combat(Stats stats, int exp, String name, ArrayList<Square> squares) {
        super(stats, exp, name);
        this.squares = squares;
    }

    public boolean coverSquares(ArrayList<Dice> dice, int squar) {
        Square square = null;
        try {
            square = squares.get(squar);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }

        if(square.isLimited()) {
            for(Dice die: dice) {
                if((die.getColor() == square.getColor() || die.getColor() == Color.BLACK) && die.getValue() >= square.getValue()) {
                    square.setCovered(true);
                    return true;
                }
            }
            return false;
        } else {
            int val = 0;
            for (Dice die : dice) {
                if (!(die.getColor() == square.getColor() || die.getColor() == Color.BLACK)) {
                    return false;
                } else {
                    val += die.getValue();
                }
            }
            if (val >= square.getValue()) {
                square.setCovered(true);
                return true;
            }
            return false;
        }
    }
}
