import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Need some way to roll dice
 *
 * */

public class Player {
    private int xp;
    private Stats stats;
    private Class aClass;
    private BufferedImage img = null;

    public Player(Class aClass) {
        this.aClass = aClass;

        switch (aClass) {
            case MAGE:
                stats = new Stats(5, 1, 2, 4);
                try {
                    ImageIO.read(new File("Images/Mage.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            case ROGUE:
                stats = new Stats(5, 1, 4, 2);
                try {
                    ImageIO.read(new File("Images/Rogue.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            case ARCHER:
                stats = new Stats(5, 2, 3, 2);
                try {
                    ImageIO.read(new File("Images/Archer.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            case PALADIN:
                stats = new Stats(5, 3, 1, 3);
                try {
                    ImageIO.read(new File("Images/Paladin.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            case WARRIOR:
                stats = new Stats(6, 4, 2, 1);
                try {
                    ImageIO.read(new File("Images/Warrior.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
                break;
            default:
                stats = new Stats(1, 1, 1, 1);
                break;
        }
    }

    public Player() {
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
}
