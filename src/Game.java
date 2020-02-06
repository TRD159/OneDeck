import org.omg.Messaging.SYNC_WITH_TRANSPORT;

//TODO: FOR THE LOVE OF GOD, GET THE DISPLAY STUFF WORKING

public class Game implements Runnable{

    Thread gameLoop;
    Deck d = null;
    Player p = null;
    int turnNumber;

    Thread t;

    boolean canExplore = true;
    //boolean canOpen = false;

    Fraem f;

    public Game() {

        d = new Deck();
        p = new Player();

        turnNumber = 1;

        t = new Thread(this);
        //t.start();
    }

    public void initPlayer(Class clas) {

    }

    public void explore() {
        if(canExplore) {
            timeSpend(2);
            d.explore();
            canExplore = false;
        }
    }

    public void open(int i) {
        if(d.getField().get(i) == null) {
            return;
        }
        timeSpend(2);
        d.getField().get(i).flip();
    }

    public void timeSpend(int t) {
        d.Discard(t);
    }

    @Override
    public void run() {
        while (true) {

        }
    }

    public void setF(Fraem f) {
        this.f = f;
    }

    public void setDungeon(int d) {
        this.d.setBoss(d);
    }

    public int getDungeon() {
        return this.d.getBoss();
    }

    public void setClass(int c) {
        p.setaClass(c);
    }

    public void takeTurn(int c) {

    }
}
