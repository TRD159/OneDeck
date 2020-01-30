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

    private void gaemLoop() {
        loop:
        {
            d.Discard(2);
            if (d.getField().size() == 0 && d.getDk().size() > 0) {
                d.explore();
            } else {
                for (Card c : d.getField()) {
                    if (c != null) {
                        System.out.println(c.toString());
                    }
                }
            }
        }
        turnNumber++;
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
