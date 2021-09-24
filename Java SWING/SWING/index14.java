import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class index14 {

    JProgressBar p;
    int i = 0;
    index14() {
        JFrame f = new JFrame();
        p = new JProgressBar(0, 1000);
        p.setBounds(100 , 150, 150 ,    30);
        p.setValue(0);
        p.setStringPainted(true);
        p.setBorder(BorderFactory.createLineBorder( Color.WHITE , 1 ));
        f.add(p);


        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);


    }

    public void iterate(){
        while(i<=1000){
            p.setValue(i);
            i=i+20;
            try{Thread.sleep(100);}catch(Exception e){}
        if (i == 1000){
            p.setVisible(false);
        }
        }
    }
    public static void main(String[] args) {
        index14 mb = new index14();
        mb.iterate();



    }
}
