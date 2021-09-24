import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index20 {
    private static Dialog d;
    index20(){
        JFrame f = new JFrame();

        d = new Dialog(f,"Dialog" , true);
        d.setLayout(new FlowLayout());

        JButton b = new JButton("ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index20.d.setVisible(false);
            }
        });

        d.add(new JLabel("plz click ok to close a dialog box"));
        d.add(b);
        d.setSize(500,300);
        d.setVisible(true);
    }




    public static void main(String[] args) {
        new index20();
    }
}
