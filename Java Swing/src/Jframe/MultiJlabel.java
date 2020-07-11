package Jlabel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultiJlabel extends JFrame {
    private Container s;
    private JLabel l1,l2;
    MultiJlabel()
    {
        fun();
    }
     
    public void fun()
    {
         s =this.getContentPane();
         s.setLayout(null);
         s.setBackground(Color.GREEN);
          
         
         l1=new JLabel();
         l1.setText("Enter Your User_name :");
         l1.setSize(150,80);
         l1.setLocation(10,10);
         s.add(l1);
         
         l2=new JLabel();
         l2.setText("Enter Your PassWord :");
         l2.setBounds(10,80,150,80);
         s.add(l2);
    }

    public static void main(String[] args) {
         MultiJlabel f=new MultiJlabel();
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setSize(400,300);
         f.setLocation(300,200);
         f.setTitle("Worning");
         f.setResizable(false);
         
    }
}
