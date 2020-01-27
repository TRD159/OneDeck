import org.omg.Messaging.SYNC_WITH_TRANSPORT;

//TODO: FOR THE LOVE OF GOD, GET THE DISPLAY STUFF WORKING

public class Game implements Runnable {
    Thread gameLoop;
    Deck d;
    Player p;
    int turnNumber;

    public Game() {
        gameLoop = new Thread(this);

        d = new Deck();
        p = new Player(Class.MAGE);

        turnNumber = 1;

        gameLoop.start();
    }

    @Override
    public void run() {
        while(true) {
            gaemLoop();
            if(d.getDk().size() == 0) {
                System.exit(-1);
            }
        }
    }

    private void gaemLoop() {
        d.Discard(2);
        if(d.getField().size() == 0 && d.getDk().size() > 0) {
            d.explore();
        } else {
            for(Card c: d.getField()) {
                if(c != null) {
                    System.out.println(c.toString());
                }
            }
        }
    }
}
