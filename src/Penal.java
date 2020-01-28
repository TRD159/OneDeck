import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Penal extends JPanel implements MouseListener, MouseMotionListener, KeyListener {
    public Penal(int x, int y) {
        super();
        //System.out.println(x + ", " +  y);
        setSize(x, y);
        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);

        super.requestFocus();
        //add(new MouseAdapter())
    }

    public void paint(Graphics g) {
        BufferedImage b2 = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g2 = b2.createGraphics();

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());
        //g2.drawImage(Player.getImg(), 0, 0, null);
        if(Main.getG().p == null) {

        }
        g.drawImage(b2, 0, 0, null);
        //System.out.println(getWidth() + ", " + getHeight());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println(e.getX());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
