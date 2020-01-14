public class Game implements Runnable {
    Thread gameLoop;
    Deck d;
    Player p;
    int turnNumber;

    public Game() {
        gameLoop = new Thread(this);

        d = new Deck();
        p = new Player();

        turnNumber = 1;

        gameLoop.start();
    }

    @Override
    public void run() {
        while(true) {
            gaemLoop();
        }
    }

    private void gaemLoop() {
        d.Discard(2);
        if(d.getField().size() == 0) {
            d.explore();
        } else {

        }
    }
}
