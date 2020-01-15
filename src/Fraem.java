import javax.swing.*;
import java.awt.*;

public class Fraem extends JFrame {
    public Fraem(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1920, 1080));

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);

        setLayout(null);

        setVisible(true);
    }
}
