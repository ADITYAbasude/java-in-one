import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Jviewpoint {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JViewpoint");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Label");
        label.setPreferredSize(new Dimension(1000,1000));
        JScrollPane scroll = new JScrollPane(label);

        JButton button = new JButton();
        scroll.setHorizontalScrollBarPolicy(scroll.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setViewportBorder(new LineBorder(Color.red));
        scroll.getViewport().add(button,null);

        frame.add(scroll,BorderLayout.CENTER);
        frame.setSize(400,150);
        frame.setVisible(true);

    }
}
