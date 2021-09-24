
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class index7 {
    JFrame fr;

    index7() {
        fr = new JFrame();

        DefaultListModel<String> lt = new DefaultListModel<>();
        lt.addElement("Item1");
        lt.addElement("Item2");
        lt.addElement("Item3");
        lt.addElement("Item4");
        lt.addElement("Item5");
        lt.addElement("Item6");
        lt.addElement("Item7");
        lt.addElement("Item8");
        lt.addElement("Item9");
        lt.addElement("Item10");
        lt.addElement("Item11");
        lt.addElement("Item12");

        JList<String> list = new JList<>(lt);
        list.setBounds(100, 100, 80, 250);

        fr.add(list);
        fr.setSize(500, 500);
        fr.setLayout(null);
        fr.setVisible(true);

    
    
    }
    public static void main(String[] args) {
        new index7();
    }


}
