import javax.swing.JRadioButton;

import javax.swing.*;
// import java.awt.event.*;

public class index4 {
    static class Radi extends JFrame { // implements ActionListener

        Radi() {
            JRadioButton r2 = new JRadioButton("First Click");
            r2.setBounds(50, 100, 80, 26);
            JRadioButton r1 = new JRadioButton("First Click");
            r2.setBounds(100, 100, 80, 26);



            add(r2);
            add(r1);
            setLayout(null);
            setSize(600, 500);
            setVisible(true);
        }

        public static void main(String[] args) {
            new Radi();
        }
    }

}
