public class Main {

    Game g;
    Fraem f;

    public void main() {
        g = new Game();
        f = new Fraem("Gaem", 1600, 900, g);
        g.setF(f);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.main();
    }

    public Game getG() {
        return g;
    }

    public Fraem getF() {
        return f;
    }
}
