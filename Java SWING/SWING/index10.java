import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class index10 {

//    index10() {
//        final JFrame j = new JFrame();
//        final JMenuItem m = new JMenuItem("Edit");
//
//        JMenuItem p = new JMenuItem("Cut");
//        JMenuItem p1 = new JMenuItem("Copy");
//        JMenuItem p2 = new JMenuItem("Paste");
//
//
//
//
//        j.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                m.show(j , e.getX() , e.getY());
//            }
//        });
//
//        m.add(p);m.add(p1);m.add(p2);
//
//
//
//
//
//        j.add(m);
//        j.setSize(500, 500);
//        j.setLayout(null);
//        j.setVisible(true);
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        new index10;
//    }



    index10(){
        final JFrame f= new JFrame("PopupMenu Example");
        final JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
//                popupmenu.show(f , e.getX(), e.getY());
                popupmenu.show(f,e.getX(),e.getY());
            }
        });
        f.add(popupmenu);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new index10();
    }


}
