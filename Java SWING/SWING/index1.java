// import java.awt.*;
import javax.swing.*;



public class index1 {



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel jl = new JLabel();
        jl.setBounds(50, 100, 85, 30);
        JLabel jl1 = new JLabel();
        jl.setBounds(100, 100, 85, 30);
        
        JTextArea ar = new JTextArea();
        ar.setBounds(150, 110, 300, 400);

        String text1 = ar.getText();
        String text2[] = text1.split("\\s");

        jl.setText("words" + text1.length());
        // jl1.setText("col" + text2.length());

        frame.add(ar);
        frame.add(jl);
        frame.add(jl1);
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    
}
