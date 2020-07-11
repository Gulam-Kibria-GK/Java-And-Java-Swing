package JTabbedPane;

import JBoutton.Button1;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JFrame{
   private Container c;
   private JTabbedPane tp;
   private JPanel p1,p2,p3;
   private JLabel l1,l2,l3;
    public TabbedPane(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        l1=new JLabel("Wellcome1");
        l2=new JLabel("Wellcome2");
        l3=new JLabel("Wellcome3");
        
        tp=new JTabbedPane();
        tp.setOpaque(true);
        tp.setBackground(Color.PINK);
        tp.setBounds(40,50,300,200);
        c.add(tp);
        
        p1=new JPanel();
        p1.setBackground(Color.RED);
        p1.add(l1);
        p2=new JPanel();
        p2.add(l3);
        p2.setBackground(Color.BLUE);
        p3=new JPanel();
        p3.add(l2);
        p3.setBackground(Color.MAGENTA);
        tp.addTab("File",p1);
        tp.addTab("Help",p3);
        tp.addTab("Edit",p2);
    }
    
    
    public static void main(String[] args) {
        TabbedPane f=new TabbedPane();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
