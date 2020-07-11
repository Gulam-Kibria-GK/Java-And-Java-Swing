package Jlabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TipsText extends JFrame{
    private Container c;
    private JLabel l1,l2;
    private Font t;
    
    TipsText()
    {
        metod();
    }
    public void metod()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        t=new Font("Arial",Font.ITALIC,20);
                
        l1=new JLabel("Enter Your Name :");
         
        l1.setBounds(10,10,300,50);
        l1.setOpaque(true);
        l1.setBackground(Color.BLUE);
        l1.setForeground(Color.RED);
        l1.setFont(t);
        l1.setToolTipText("Enter Your User_Name");
        c.add(l1);
        
        l2=new JLabel("Enter Your PassWord :");
        l2.setBounds(10,60,300,50);
        l2.setOpaque(true);
        l2.setBackground(Color.GREEN);
        l2.setForeground(Color.RED);
        l2.setToolTipText("Enter Your PassWord");
        l2.setFont(t);
        c.add(l2);
        
       
    }
    
    
    public static void main(String[] args) {
        TipsText f=new TipsText();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,200,400,300);
        
        f.setTitle("Frame");
        f.setResizable(false);
    }
}
