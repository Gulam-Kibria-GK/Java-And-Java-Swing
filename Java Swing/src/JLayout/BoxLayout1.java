package JLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayout1 extends JFrame{
    private Container c;
    private JButton b[];
    private BoxLayout bxout;
    BoxLayout1()
    {
        method();
    }
    public void method(){
        
        c=this.getContentPane();
        bxout=new BoxLayout(c,BoxLayout.X_AXIS);
        c.setBackground(Color.yellow);
        c.setLayout(bxout);
        
        b=new JButton[9];
        
        for(int i=0;i<9;i++)
        {
            b[i]=new JButton(""+(i+1));
            c.add(b[i]);
            c.add(Box.createHorizontalStrut(10));
        }
        
        
    }
       
    public static void main(String[] args) {
        BoxLayout1 a=new BoxLayout1();
        a.setVisible(true);
        a.setBounds(100,100,500,400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setTitle("FlowLayout");
        //a.setResizable(false);
    }
}
