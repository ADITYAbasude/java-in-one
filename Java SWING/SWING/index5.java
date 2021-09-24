

// -----------------------MINE EXCAL-----------------------


import javax.swing.*;

// import java.awt.event.*;
public class index5 {

    JFrame myf;

    index5() {
        myf = new JFrame();
        // String ch[][] = { { "1", "aditya", "Computer Engineer" }, { "2", "kiran", "Accounting" },
        //         { "3", "jatin", "Civil Electric Engineer" }, { "4", "jagdish", "Bank Manager" }, };
        // String col[] = {"Sr. No","Name","Job"};
        JTable ta = new JTable(50,50);
        ta.setBounds(20, 25, 200,400);
        JScrollPane scr = new JScrollPane(ta);
        JScrollPane scr1 = new JScrollPane(ta);

        myf.add(scr);
        myf.add(scr1);
        // myf.setLayout(null);
        myf.setSize(300,500);
        myf.setVisible(true);
    }

    public static void main(String[] args) {
        new index5();
    }

}
