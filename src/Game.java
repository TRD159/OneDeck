import org.omg.Messaging.SYNC_WITH_TRANSPORT;

//TODO: FOR THE LOVE OF GOD, GET THE DISPLAY STUFF WORKING

public class Game{

    Thread gameLoop;
    Deck d = null;
    Player p = null;
    int turnNumber;

    public Game() {

        //d = new Deck();
        //p = new Player(Class.MAGE);

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
}
