import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Need some way to roll dice
 *
 * */

public class Player {
    private int xp;
    private Stats stats;

    public Player(Stats stats) {
        this.stats = stats;
    }

    public Player() {
    }

    public ArrayList<Dice> diceRoll() {
        ArrayList<Dice> d = new ArrayList<>();

        for(int x = 0; x < stats.getStr(); x++) {
            d.add(new Dice(Color.YELLOW, randomWithRange(1, 6)));
        }

        for(int x = 0; x < stats.getDex(); x++) {
            d.add(new Dice(Color.PURPLE, randomWithRange(1, 6)));
        }

        for(int x = 0; x < stats.getMag(); x++) {
            d.add(new Dice(Color.BLUE, randomWithRange(1, 6)));
        }

        return d;
    }

    int randomWithRange(int min, int max) //Inclusive on both ends
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
