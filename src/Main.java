public class Main {
    static Game g;
    static Fraem f;

    public static void main(String[] args) {
        g = new Game();
        f = new Fraem("Name", 1600, 900);
    }

    public static Game getG() {
        return g;
    }

    public static Fraem getF() {
        return f;
    }
}
