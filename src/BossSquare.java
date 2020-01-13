

public class BossSquare extends Square {
    boolean damage;

    public BossSquare(boolean limited, int time, int health, Color color, int value, boolean damage, boolean armor) {
        super(limited, time, health, color, value, armor);
        this.damage = damage;
    }
}
