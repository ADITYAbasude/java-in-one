import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class tbnt {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        final JTextField t = new JTextField("Hello");


        t.setBounds(50 , 100,150,20);
        JButton b = new JButton("Click");
        b.setBounds(50,50,95,30);
        
        

        
        j.add(t);
        j.add(b);
        j.setLayout(null);
        j.setSize(500,500);
        j.setVisible(true);
        

    }

 
}
