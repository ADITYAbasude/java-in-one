
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class ttext{
    public static void main(String[] args) {
        
        JFrame j; JTextField t; JLabel l; JButton b;

        j = new JFrame();

        t = new JTextField();
        t.setBounds(250, 180, 105, 26);

        l = new JLabel();
        l.setBounds(250, 205, 95, 50);

        b = new JButton("Find IP");
        b.setBounds(250, 250, 100, 25);


        j.add(l);
        j.add(t);
        j.add(b);
        j.setLayout(null);
        j.setSize(600, 700);
        j.setVisible(true);
    }
    
}

