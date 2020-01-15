/**
 * Squares go on bosses or encounters, and they're what you put dice on.
 *
 * */

public class Square {
    private boolean limited; //Determines whether the square is small or large
    private boolean covered;
    private int time, health; //This is the square's consequences
    private Color color; //The square's color, can only be covered by like-colored dice or black dice
    private int value; //The value of the square, only dice with the same value or higher can cover it.
    private boolean armor; //Armor squares have to be covered first

    public Square(boolean limited, int time, int health, Color color, int value, boolean armor) {
        this.limited = limited;
        this.time = time;
        this.health = health;
        this.color = color;
        this.value = value;
        covered = false;
        this.armor = armor;
    }

    public boolean isLimited() {
        return limited;
    }

    public boolean isCovered() {
        return covered;
    }

    public int getTime() {
        return time;
    }

    public int getHealth() {
        return health;
    }

    public Color getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public boolean isArmor() {
        return armor;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    @Override
    public String toString() {
        return "Square{" +
                "limited=" + limited +
                ", covered=" + covered +
                ", time=" + time +
                ", health=" + health +
                ", color=" + color +
                ", value=" + value +
                ", armor=" + armor +
                '}';
    }
}
