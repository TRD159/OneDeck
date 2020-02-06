import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImgLoader {
    Map<String, BufferedImage> images;

    public ImgLoader() {
        images = new HashMap<>();
        File folder = new File("Images");
        try {
            for (File file : folder.listFiles()) {
                if (file.isFile()) {
                    StringBuffer s = new StringBuffer(file.getName());
                    s.delete(s.length() - 4, s.length());

                    //BufferedImage b = null;

                    images.put(s.toString(), ImageIO.read(file));
                    //System.out.println(s.indexOf("."));
                    //System.out.println(s.toString());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public BufferedImage getImage(String name) {
        return images.get(name);
    }

    public BufferedImage getImage(String name, double factor) {
        int w = (int)(images.get(name).getWidth() * factor);
        int h = (int)(images.get(name).getHeight() * factor);

        BufferedImage b = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        b.createGraphics().drawImage(images.get(name), 0, 0, w, h, null);

        return b;
    }

    public BufferedImage loadImage(String name, double factor) {
        try {
            BufferedImage img = null;

            Rectangle source = null;
            Rectangle destination = null;

            BufferedImage i = null;
            try {
                img = ImageIO.read(new File("Images/" + name + ".JPG"));

                source = new Rectangle(img.getWidth(), img.getHeight());
                destination = new Rectangle((int) (img.getWidth() * factor), (int) (img.getHeight() * factor));

                i = new BufferedImage(destination.width, destination.height, 2);
            } catch (Exception e) {
                System.exit(-100);
            }

            i.createGraphics().drawImage(img, destination.x, destination.y, destination.x + destination.width, destination.y + destination.height, source.x, source.y, source.x + source.width, source.y + source.height, null);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
