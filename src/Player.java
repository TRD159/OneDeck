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

    private static BufferedImage mage = null, rogue = null, paladin = null, archer = null, warrior = null;

    public Player(int aClass) {
        this.aClass = aClass;

        double f = 2.0;

        try {
            img = ImageIO.read(new File("Images/Mage.jpg"));
            resize(mage, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Rogue.jpg"));
            resize(rogue, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Archer.jpg"));
            resize(archer, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Paladin.jpg"));
            resize(paladin, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Warrior.jpg"));
            resize(warrior, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        switch (aClass) {
            case PALADIN:
                resize(image, paladin, 1);
                stats = new Stats(5, 3, 1, 3);
                break;
            case ROGUE:
                resize(image, rogue, 1);
                stats = new Stats(5, 1, 4, 2);
                break;
            case WARRIOR:
                resize(image, warrior, 1);
                stats = new Stats(6, 4, 2, 1);
                break;
            case MAGE:
                resize(image, mage, 1);
                stats = new Stats(5, 1, 2, 4);
                break;
            case ARCHER:
                resize(image, archer, 1);
                stats = new Stats(5, 2, 3, 1);
                break;
        }
    }

    public Player() {
        aClass = NONE;

        double f = 2.0;

        try {
            img = ImageIO.read(new File("Images/Mage.jpg"));
            resize(mage, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Rogue.jpg"));
            resize(rogue, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Archer.jpg"));
            resize(archer, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Paladin.jpg"));
            resize(paladin, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

        try {
            img = ImageIO.read(new File("Images/Warrior.jpg"));
            resize(warrior, img, f);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
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

    public static BufferedImage getMage() {
        return mage;
    }

    public static BufferedImage getRogue() {
        return rogue;
    }

    public static BufferedImage getPaladin() {
        return paladin;
    }

    public static BufferedImage getArcher() {
        return archer;
    }

    public static BufferedImage getWarrior() {
        return warrior;
    }

    public int getaClass() {
        return aClass;
    }

    public static BufferedImage getImg() {
        return image;
    }
}
