import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Need some way to roll dice
 *
 * */

public class Player {
    public static final int NONE = 0, MAGE = 1, ROGUE = 2, PALADIN = 3, ARCHER = 4, WARRIOR = 5;

    private int xp;
    private Stats stats;
    private int aClass;
    private static BufferedImage img = null;
    private static BufferedImage image = null;

    public Player(int aClass) {
        this.aClass = aClass;

        switch (aClass) {
            case PALADIN:
                stats = new Stats(5, 3, 1, 3);
                break;
            case ROGUE:
                stats = new Stats(5, 1, 4, 2);
                break;
            case WARRIOR:
                stats = new Stats(6, 4, 2, 1);
                break;
            case MAGE:
                stats = new Stats(5, 1, 2, 4);
                break;
            case ARCHER:
                stats = new Stats(5, 2, 3, 1);
                break;
        }
    }

    public Player() {
        aClass = NONE;
    }

    private void resize(BufferedImage i, BufferedImage m, double f) {
        i = new BufferedImage((int)(m.getWidth()/f), (int)(m.getHeight()/f), BufferedImage.TYPE_INT_ARGB);
        Graphics g2 = i.createGraphics();
        g2.drawImage(img,  0, 0, (int)(m.getWidth()/f), (int)(m.getHeight()/f), 0, 0, m.getWidth(), img.getHeight(), null);
    }

    public ArrayList<Dice> diceRoll() {
        ArrayList<Dice> d = new ArrayList<>();

        for(int x = 0; x < stats.getStr(); x++) {
            d.add(new Dice(Color.YELLOW, randomWithRange(1, 6)));
        }

        for(int x = 0; x < stats.getDex(); x++) {
            d.add(new Dice(Color.PURPLE, randomWithRange(1, 6)));
        }

        for(int x = 0; x < stats.getMag(); x++) {
            d.add(new Dice(Color.BLUE, randomWithRange(1, 6)));
        }

        return d;
    }

    int randomWithRange(int min, int max) //Inclusive on both ends
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public int getaClass() {
        return aClass;
    }

    public void setaClass(int aClass) {
        this.aClass = aClass;

        switch (aClass) {
            case PALADIN:
                stats = new Stats(5, 3, 1, 3);
                break;
            case ROGUE:
                stats = new Stats(5, 1, 4, 2);
                break;
            case WARRIOR:
                stats = new Stats(6, 4, 2, 1);
                break;
            case MAGE:
                stats = new Stats(5, 1, 2, 4);
                break;
            case ARCHER:
                stats = new Stats(5, 2, 3, 1);
                break;
        }
    }

    public static BufferedImage getImg() {
        return image;
    }
}
