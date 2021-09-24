import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index16 extends JFrame implements ActionListener {
    JButton b;
    Container c;
    JTextArea a;

    index16(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Select a color");
        b.setBounds(400 , 400 , 60 , 20);
        b.addActionListener(this);
        c.add(b);

        a = new JTextArea();
        a.setBounds(50 , 20 , 200 , 200);
        add(a);
        add(b);
        setSize(500,660);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Color col = JColorChooser.showDialog(this,"se" , Color.CYAN);
        a.setBackground(col);
    }


    public static void main(String[] args) {
        index16 i = new index16();

    }
}
