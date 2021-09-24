import javax.swing.*;
import java.awt.*;

public class index13 {


    public static void main(String[] args) {
//        JMenu m,m1;
//        JMenuItem i1,i2,i3;
        JFrame f = new JFrame();
//
//        JMenuBar b = new JMenuBar();
//        m  = new JMenu("menu");
//        i1 = new JMenuItem("1");
//        i2 = new JMenuItem("2");
//        i3 = new JMenuItem("3");
//
//
//        m.add(i1);m.add(i2);m.addSeparator(); m.add(i3);
//        b.add(m);
//
//

//        f.setJMenuBar(b);


//        new project


        JLabel l = new JLabel("part 1");
        f.add(l);

        JSeparator s = new JSeparator();
        f.add(s);

        JLabel l1 = new JLabel("part 1");
        f.add(l1);

        f.setSize(500,500);
        f.setLayout(new GridLayout(0,1));
//        f.setLayout(null);
        f.setVisible(true);









    }
}
