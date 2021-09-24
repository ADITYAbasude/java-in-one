import javax.swing.*;

public class index17 extends JFrame {



    index17(){
        JTextArea t = new JTextArea();
        JPanel p = new JPanel();
        p.add(t);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JTabbedPane b = new JTabbedPane();
        b.setBounds(50, 30, 230, 150);
        b.add("main",p);
        b.add("Item1",p1);
        b.add("Item2", p2);

        add(b);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
            new index17();
    }
}
