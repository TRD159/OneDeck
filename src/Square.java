/**
 * Squares go on bosses or encounters, and they're what you put dice on.
 *
 * */

public class Square {
    boolean limited; //Determines whether the square is small or large
    boolean covered;
    int time, health; //This is the square's consequences
    Color color; //The square's color, can only be covered by like-colored dice or black dice
    int value; //The value of the square, only dice with the same value or higher can cover it.

    public Square(boolean limited, int time, int health, Color color, int value) {
        this.limited = limited;
        this.time = time;
        this.health = health;
        this.color = color;
        this.value = value;
        covered = false;
    }
}
