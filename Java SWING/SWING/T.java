import javax.swing.JButton;
import javax.swing.JFrame;

public class T {
    
    public static void main(String[] args) {
        JFrame myJ = new JFrame();
        JButton btn = new JButton("plz click me");




        myJ.add(btn);
        myJ.setLayout(null);
        btn.setBounds(150, 200, 100, 30);
        myJ.setSize(400,500);

        myJ.setVisible(true);
    }
    
}
