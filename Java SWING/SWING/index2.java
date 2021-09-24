import javax.swing.JPasswordField;

// import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index2 {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        final JPasswordField pa = new JPasswordField("Password");
        pa.setBounds(100, 150, 120, 30);

        JButton mb = new JButton("click");
        mb.setBounds(100, 180, 82, 30);

        JLabel ml = new JLabel();

        ml.setBounds(100, 205, 150, 25);

        mb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pass = "Password : " + new String(pa.getPassword()) ;
                ml.setText(pass);
                
            }
        });

        fr.add(mb);
        fr.add(pa);
        fr.add(ml);
        fr.setSize(600,700);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    
}
