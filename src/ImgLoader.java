import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImgLoader {
    public BufferedImage loadImage(String name, double factor) {
        BufferedImage img = null;

        Rectangle source = null;
        Rectangle destination = null;

        BufferedImage i = null;
        try {
            img = ImageIO.read(new File("Images/" + name + ".JPG"));

            source = new Rectangle(img.getWidth(), img.getHeight());
            destination = new Rectangle((int)(img.getWidth() * factor), (int)(img.getHeight() * factor));

            i = new BufferedImage(destination.width, destination.height, 2);
        } catch (Exception e) {
            System.exit(-100);
        }

        i.createGraphics().drawImage(img, destination.x, destination.y, destination.x + destination.width, destination.y + destination.height, source.x, source.y, source.x + source.width, source.y + source.height, null);
        return i;
    }
}
