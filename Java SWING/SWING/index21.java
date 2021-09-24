import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class index21 extends JFrame implements ActionListener {
    JMenu m;
    JMenuBar mb;
    JMenuItem mi;
    JTextArea t;

    index21(){
        mi = new JMenuItem("Open File");
        mi.addActionListener(this);
        m =new JMenu("File select");
        m.add(mi);
        mb = new JMenuBar();
        mb.setBounds(0,0,800,20);
        mb.add(m);
        t = new JTextArea(300,300);
        t.setBounds(0,20,300,300);
        add(mb);
        add(t);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi){
            JFileChooser f = new JFileChooser();
            int i = f.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION){
                File fi = f.getSelectedFile();
                String filepath = fi.getPath();
                try{
                    BufferedReader b = new BufferedReader(new FileReader(filepath));
                    String s1="",s2="";
                    while((s1=b.readLine())!= null ){
                        s2+=s1="\n";
                    }
                    t.setText(s2);
                    b.close();



                } catch (IOException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        }

    }






    public static void main(String[] args) {
        index21 am = new index21();
        am.setSize(500,500);
        am.setLayout(null);
        am.setVisible(true);
        am.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
