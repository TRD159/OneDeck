import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Penal extends JPanel {
    public Penal(int x, int y) {
        super();
        //System.out.println(x + ", " +  y);
        setSize(x, y);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        System.out.println(getWidth() + ", " + getHeight());
    }
}
