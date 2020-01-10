/**
 *
 *
 * */

public class Encounter extends Card {
    private Stats stats;
    private int exp;

    public Encounter(Stats stats, int exp, String name) {
        super(name);
        this.stats = stats;
        this.exp = exp;
    }

    public Stats getStats() {
        return stats;
    }

    public int getExp() {
        return exp;
    }
}
