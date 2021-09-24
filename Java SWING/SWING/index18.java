import javax.swing.*;

public class index18 extends JFrame {

    index18(){
        JSlider s = new JSlider(JSlider.HORIZONTAL,0,50,20);
        s.setMinorTickSpacing(2);
        s.setMajorTickSpacing(10);
        s.setPaintTicks(true);
        s.setPaintLabels(true);

        JPanel p = new JPanel();
        p.add(s);
        add(p);

    }



    public static void main(String[] args) {
        index18 a = new index18();
        a.pack();
        a.setVisible(true);

    }

}
