import java.awt.event.*;
import javax.swing.*;

public class nsek {

    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        // final JTextField tf = new JTextField();
        // tf.setBounds(50, 50, 150, 20);
        // JButton b = new JButton(new ImageIcon("C:\\Users\\A D I T Y A\\OneDrive\\Desktop\\Java FX , SWING and CSS\\SWING\\darkcoder.jpg"));
        // b.setBounds(50, 100, 95, 30);
        JTextField tf; JLabel l; JButton b;  
        
        tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        l=new JLabel();  
        l.setBounds(50,100, 250,20);      
        b=new JButton("Find IP");  
        b.setBounds(50,150,95,30);  
        // b.addActionListener(this);    
        f.add(b);f.add(tf);f.add(l);    
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{  
                    String host=tf.getText();  
                    String ip=java.net.InetAddress.getByName(host).getHostAddress();  
                    l.setText("IP of "+host+" is: "+ip);  
                    }catch(Exception ex){System.out.println(ex);}  
                
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
