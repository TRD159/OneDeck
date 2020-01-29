import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLACK;

public class Fraem extends JFrame{
    public Fraem(String title, int x, int y, Game g) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //pack();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(false);

        setResizable(false);

        setLayout(null);

        Insets i = getInsets();

        int w = x + i.left + i.right;
        int h = y + i.top + i.bottom;

        setPreferredSize(new Dimension(w, h));

        add(new Penal(x, y, g));

        pack();
        setSize(w, h);

        setVisible(true);
    }
}
