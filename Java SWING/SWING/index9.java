import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class index9 implements ActionListener {
    JTextField tx;
    JTextField t ;
    String str;
    public index9(){
        JFrame myfra = new JFrame("Calculator");


        tx = new JTextField();
        tx.setBounds(90, 50, 200, 30);
        tx.setEditable(false);







        t = new JTextField();
        t.setBounds(90, 120, 200, 20);
        t.setEditable(false);

        JButton b = new JButton("1");
        b.setBounds(50 , 90 , 100 , 25);
        b.addActionListener(this);

        JButton b1 = new JButton("2");
        b1.setBounds(200 , 90 , 100 , 25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tx.setText("2");

            }
        });










        myfra.add(b1);
        myfra.add(b);
        myfra.add(t);
        myfra.add(tx);
        myfra.setLayout(null);
        myfra.setSize(500,400);
        myfra.setVisible(true);



    }

    public void actionPerformed(ActionEvent e) {

        tx.setText("1");
    }





    public static void main(String[] args) {
        new index9();
    }


}
