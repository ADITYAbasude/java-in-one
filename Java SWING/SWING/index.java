import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class index {

    public static void main(String[] args) {
        JTextField tx1, tx2 , tx3 ; 
        JButton btn1 , btn2;
        JFrame Myf = new JFrame();

        tx1 = new JTextField();
        tx1.setBounds(100, 120, 120, 30);

        tx2 = new JTextField();
        tx2.setBounds(100, 150, 120, 30);

        tx3 = new JTextField();
        tx3.setBounds(100, 190, 120, 30);
        tx3.setEditable(false);

        btn1 = new JButton("+");
        btn1.setBounds(90, 230, 50, 30);
        btn1.setBorder(BorderFactory.createEmptyBorder());
        btn1.setFocusable(true);
        btn1.setContentAreaFilled(true);

        btn2 = new JButton("-");
        btn2.setBounds(150, 230, 50, 30);


        btn1.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){

                String st1 = tx1.getText();
                String st2 = tx2.getText();
    
                int a = Integer.parseInt(st1);
                int b = Integer.parseInt(st2);
                int c = 0;
                if(e.getSource()==btn1){
                    c=a+b;
                }


                String re = String.valueOf(c);
                tx3.setText(re);



            }

            

           
        });



        btn2.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){

                String st1 = tx1.getText();
                String st2 = tx2.getText();
    
                int a = Integer.parseInt(st1);
                int b = Integer.parseInt(st2);
                int c = 0;
                if(e.getSource()==btn1){
                    c=a-b;
                }


                String re = String.valueOf(c);
                tx3.setText(re);



            }

            

           
        });








        Myf.add(tx1);
        Myf.add(tx2);
        Myf.add(tx3);
        Myf.add(btn1);
        Myf.add(btn2);
        Myf.setSize(600,600);
        Myf.setLayout(null);
        Myf.setVisible(true);





        
        
    }
    
}
 