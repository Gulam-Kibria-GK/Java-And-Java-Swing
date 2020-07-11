package Jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Font1 extends JFrame {
   private Container c;
   private JLabel l1,l2;
   private Font t;
    Font1() {
        metod();
    }

    public void metod() {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        t=new Font("Arial",Font.BOLD,20);
        
        l1=new JLabel("Enter Your nmae :");
        l1.setSize(300,50);
        l1.setLocation(10,10);
        l1.setFont(t);
        c.add(l1);
        
        l2=new JLabel("Enter Your PassWord :");
        l2.setBounds(10,60,300,50);
        l2.setFont(t);
        c.add(l2);
    }

    public static void main(String[] args) {
        Font1 f = new Font1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.setLocation(400, 300);
        f.setTitle("Page");
        f.setResizable(false);

    }
}
