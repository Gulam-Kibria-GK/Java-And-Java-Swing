package Jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class For_Back_GroundColor extends JFrame{
    private Container c;
    private JLabel l1,l2;
    private Font t;
    
    For_Back_GroundColor()
    {
        metod();
    }
    public void metod()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        t=new Font("Arial",Font.BOLD,20);
        
        l1=new JLabel();
        l1.setText("Enter Your Name :");
        l1.setBounds(10,10,300,50);
        l1.setForeground(Color.RED);
        l1.setOpaque(true);
        l1.setBackground(Color.blue);
        l1.setFont(t);
        c.add(l1);
        
        l2=new JLabel("Enter Your PassWord :");
        l2.setBounds(10,60,300,50);
        l2.setForeground(Color.RED);
        l2.setOpaque(true);
        l2.setBackground(Color.GREEN);
        l2.setFont(t);
        c.add(l2);
    }
    
    public static void main(String[] args) {
        For_Back_GroundColor f=new For_Back_GroundColor();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);
        //f.setLocationRelativeTo(null);
        f.setLocation(300,200);
        f.setTitle("FRAME");
        f.setResizable(false);
    }
}
