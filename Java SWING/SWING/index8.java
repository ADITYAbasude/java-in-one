 import javax.swing.*;

 import java.awt.event.*;

 public class index8 {
     JFrame f;
     JMenu mean, submenu;
     JMenuItem i1, i2, i3, i4, i5, i6;
     JTextArea ta;


     index8() {
         f = new JFrame();
         JMenuBar m = new JMenuBar();
         mean = new JMenu("hello");
         submenu = new JMenu("click ");
         i1 = new JMenuItem("aditya");
         i2 = new JMenuItem("Kiran");
         i3 = new JMenuItem("Jatin");
         i4 = new JMenuItem("Jagdish");
         i5 = new JMenuItem("Jyoti");
         i6 = new JMenuItem("Sunil");
//         i1.addActionListener(this);
//         i2.addActionListener(this);
//         i3.addActionListener(this);
//         i4.addActionListener(this);

         ta = new JTextArea();
         ta.setBounds(5, 5, 360, 320);

         mean.add(i1);
         mean.add(i2);
         mean.add(i3);
         mean.add(i4);
         mean.add(submenu);
         submenu.add(i5);
         submenu.add(i6);
         m.add(mean);

         f.setJMenuBar(m);
         f.setSize(600, 600);
         f.setLayout(null);
         f.setVisible(true);
     }

     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == i1)
             ta.cut();
         if (e.getSource() == i2)
             ta.paste();
         if (e.getSource() == i3)
             ta.copy();
         if (e.getSource() == i4)
             ta.selectAll();
     }

     public static void main(String[] args) {
         new index8();
     }

 }
