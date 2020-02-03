import org.omg.Messaging.SYNC_WITH_TRANSPORT;

//TODO: FOR THE LOVE OF GOD, GET THE DISPLAY STUFF WORKING

public class Game{

    Thread gameLoop;
    Deck d = null;
    Player p = null;
    int turnNumber;

    Fraem f;

    public Game() {

        d = new Deck();
        p = new Player();

        turnNumber = 1;
    }

    public void initPlayer(Class clas) {

    }

    public void timeSpend(int t) {
        d.Discard(t);
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
}
