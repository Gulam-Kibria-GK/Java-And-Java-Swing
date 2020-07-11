package JLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout1 extends JFrame{
    private Container c;
    private JButton b[];
    private GridLayout gout;
    GridLayout1()
    {
        method();
    }
    public void method(){
        
        c=this.getContentPane();
        gout=new GridLayout(3,3);
        c.setBackground(Color.yellow);
        c.setLayout(gout);
        
        b=new JButton[9];
        
        for(int i=0;i<9;i++)
        {
            b[i]=new JButton(""+(i+1));
            c.add(b[i]);
        }
        
        
    }
       
    public static void main(String[] args) {
        GridLayout1 a=new GridLayout1();
        a.setVisible(true);
        a.setBounds(100,100,500,400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setTitle("FlowLayout");
        //a.setResizable(false);
    }
}
