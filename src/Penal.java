import com.sun.deploy.ui.ImageLoader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Penal extends JPanel implements MouseListener, MouseMotionListener, KeyListener {
    JButton a, m, w, r, p;
    JButton explore, flip;

    ArrayList<Point> points;

    Game gaem;

    ImgLoader imgLoader;

    public Penal(int x, int y, Game g) {
        super();
        //System.out.println(x + ", " +  y);
        setSize(x, y);
        addMouseListener(this);
        addKeyListener(this);
        addMouseMotionListener(this);

        points = new ArrayList<Point>() {
            {
                add(new Point(470, 250));
                add(new Point(866, 250));
            }
        };

        super.requestFocus();

        setLayout(null);

        this.gaem = g;

        a = new JButton("Archer");
        m = new JButton("Mage");
        w = new JButton("Warrior");
        r = new JButton("Rogue");
        p = new JButton("Paladin");

        addElement(a, 0, 550, 280, 40);
        addElement(p, 325, 550, 280, 40);
        addElement(w, 650, 550, 280, 40);
        addElement(r, 975, 550, 280, 40);
        addElement(m, 1300, 550, 280, 40);

        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gaem.p.setaClass(Player.ARCHER);
                a.setEnabled(false);
                remove(a);
                remove(p);
                remove(w);
                remove(r);
                remove(m);
                repaint();
            }
        });

        p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gaem.p.setaClass(Player.PALADIN);
                a.setEnabled(false);
                remove(a);
                remove(p);
                remove(w);
                remove(r);
                remove(m);
                repaint();
            }
        });

        w.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gaem.p.setaClass(Player.WARRIOR);
                a.setEnabled(false);
                remove(a);
                remove(p);
                remove(w);
                remove(r);
                remove(m);
                repaint();
            }
        });

        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gaem.p.setaClass(Player.ROGUE);
                a.setEnabled(false);
                remove(a);
                remove(p);
                remove(w);
                remove(r);
                remove(m);
                repaint();
            }
        });

        m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gaem.p.setaClass(Player.MAGE);
                a.setEnabled(false);
                remove(a);
                remove(p);
                remove(w);
                remove(r);
                remove(m);
                repaint();
            }
        });


        //explore.setEnabled(false);

        imgLoader = new ImgLoader();

        //addElement(b, 100, 100, 100, 20);

        //add(new MouseAdapter())
    }

    private void addElement(JComponent c, int x, int y, int w, int h) {

        add(c);

        c.setBounds(x, y, w, h);
        //c.repaint();

        c.setEnabled(true);
    }

    public void paint(Graphics g) {

        BufferedImage b2 = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g2 = b2.createGraphics();

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setFont(new Font("Font", Font.BOLD, 100));

        g2.setColor(Color.WHITE);

        //g2.drawImage(Player.getImg(), 0, 0, null);
        if(gaem.p.getaClass() == 0) {
            //System.out.println(gaem.p.getArcher());
            g2.drawImage(imgLoader.getImage("Archer", 0.4), 0, 100, null);
            g2.drawImage(imgLoader.getImage("Paladin", 0.4), 325, 100, null);
            g2.drawImage(imgLoader.getImage("Warrior", 0.4), 650, 100, null);
            g2.drawImage(imgLoader.getImage("Rogue", 0.4), 975, 100, null);
            g2.drawImage(imgLoader.getImage("Mage", 0.4), 1300, 100, null);
            g2.drawString("Select Your Player Character", 100, 800);
        } else {
            //g2.setFont(new Font("Font", Font.PLAIN, 40));
            //g2.drawString("Player:", 0, 440);
            BufferedImage pc = null;
            switch (gaem.p.getaClass()) {
                case Player.ARCHER:
                    pc = imgLoader.getImage("Archer", 0.4);
                    break;
                case Player.MAGE:
                    pc = imgLoader.getImage("Mage", 0.4);
                    break;
                case Player.PALADIN:
                    pc = imgLoader.getImage("Paladin", 0.4);
                    break;
                case Player.ROGUE:
                    pc = imgLoader.getImage("Rogue", 0.4);
                    break;
                case Player.WARRIOR:
                    pc = imgLoader.getImage("Warrior", 0.4);
            }
            //g2.drawImage(pc, 0, 460, null);

            if(gaem.getDungeon() == 0) {
                g2.drawString("Select a Dungeon", 325, 150);

                g2.drawImage(imgLoader.getImage("DragonCave", 0.6), 50, 200, null);
                g2.drawImage(imgLoader.getImage("HydraReef", 0.6), 550, 200, null);
                g2.drawImage(imgLoader.getImage("YetiCavern", 0.6), 1050, 200, null);
                g2.drawImage(imgLoader.getImage("MinotaurMaze", 0.6), 300, 550, null);
                g2.drawImage(imgLoader.getImage("LichTomb", 0.6), 900, 550, null);
            } else {
                //explore.setEnabled(true);
                //repaint();

                g2.drawImage(imgLoader.getImage("BackOfCard", 0.25), 668, 50, null);
                g2.drawString("" + gaem.d.getDk().size(), 735, 175);
                
                

                g2.setFont(new Font("Font", Font.PLAIN, 50));
                g2.drawString("Potion Tokens: " + gaem.p.getPotions(), 10, 850);

                String h = "HP: " + gaem.p.getStats().getHp();
                if(gaem.p.getDamage() > 0) {
                    h += " - " + gaem.p.getDamage();
                }
                g2.drawString(h, 10, 50);
                g2.drawString("STR: " + gaem.p.getStats().getStr(), 10, 100);
                g2.drawString("DEX: " + gaem.p.getStats().getDex(), 10, 150);
                g2.drawString("MAG: " + gaem.p.getStats().getMag(), 10, 200);

                g2.setColor(Color.GRAY);
                g2.fillRect(1400, 255, 175, 60);
                /*g2.fillRect(1400, 455, 125, 60);*/

                g2.setColor(Color.WHITE);
                g2.drawString("Explore", 1400, 300);
            }
        }

        g.drawImage(b2, 0, 0, null);
        //System.out.println(gaem.p.getArcher().getWidth());

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
        if(gaem.getDungeon() == 0 && gaem.p.getaClass() != Player.NONE) {
            if (e.getY() > 200 && e.getY() < 500) {
                if (e.getX() > 50 && e.getX() < 470) {
                    gaem.setDungeon(Deck.DRAGON);
                    repaint();
                } else if(e.getX() > 550 && e.getX() < 970) {
                    gaem.setDungeon(Deck.HYDRA);
                    repaint();
                } else if(e.getX() > 1050 && e.getX() < 1470) {
                    gaem.setDungeon(Deck.YETI);
                }
            } else if(e.getY() > 550 && e.getY() < 750) {
                if(e.getX() > 300 && e.getX() < 720) {
                    gaem.setDungeon(Deck.MINOTAUR);
                } else if(e.getX() > 800 && e.getX() < 1220) {
                    gaem.setDungeon(Deck.LICH);
                }
            }
        } else {
            if(e.getX() > 1400 && e.getX() < 1575 && e.getY() > 255 && e.getY() < 315) {
                gaem.explore();
                System.out.println(gaem.d.getDk().size());
                //repaint();
                
            }
        }
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
