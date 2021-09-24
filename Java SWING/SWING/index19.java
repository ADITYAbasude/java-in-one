import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class index19 extends JFrame implements ChangeListener {
    JLabel l;
    index19(){
        l = new JLabel();
        l.setBounds(80,20,150,25);
        SpinnerModel a = new SpinnerNumberModel(5,0,100,1);
        JSpinner s = new JSpinner(a);
        s.setBounds(90,50,50,21);
        s.addChangeListener(this);
        add(s);
        add(l);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new index19();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        l.setText("Value is selected : " + ((JSpinner)e.getSource()).getValue());
    }
}
