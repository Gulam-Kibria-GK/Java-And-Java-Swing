package JLayout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BorerLayout extends JFrame {
    private Container c;
    private JButton b1,b2,b3,b4,b5;
    private BorderLayout bout;
    
    
    
    BorerLayout() {
        sof();
    }

    public void sof() {
        
        c=this.getContentPane();
        bout=new BorderLayout();
        bout.setHgap(10);
        bout.setVgap(5);
        c.setLayout(bout);
        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        
        c.add(b1,BorderLayout.NORTH);
        c.add(b2,BorderLayout.WEST);
        c.add(b3,BorderLayout.CENTER);
        c.add(b4,BorderLayout.EAST);
        c.add(b5,BorderLayout.SOUTH);
        
    }

    public static void main(String[] args) {
        BorerLayout a=new BorerLayout();
        a.setVisible(true);
        a.setBounds(100,100,500,400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setTitle("Layout");
        a.setResizable(false);
        
    }
}
