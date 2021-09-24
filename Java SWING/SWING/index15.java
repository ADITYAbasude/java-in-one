import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class index15 extends JFrame {

    index15(){

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("font");
        a.add(b);
        a.add(c);
        DefaultMutableTreeNode e = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode f = new DefaultMutableTreeNode("Cyan");
        b.add(e);
        b.add(f);

        JTree t = new JTree(a);
        add(t);
//        setLayout(null);
        setSize(500 , 550);
        setVisible(true);


    }


    public static void main(String[] args) {
        new index15();
    }

}
