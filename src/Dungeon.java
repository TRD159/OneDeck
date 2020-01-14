import java.util.ArrayList;

public class Dungeon {
    int level = 1;

    ArrayList<Square> perilSquares, combatSquares;

    public Dungeon(ArrayList<Square> perilSquares, ArrayList<Square> combatSquares) {
        this.perilSquares = perilSquares;
        this.combatSquares = combatSquares;
    }

    public Dungeon() {
    }
}
