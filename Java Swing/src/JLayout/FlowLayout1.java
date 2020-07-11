package JLayout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout1 extends JFrame{
    private Container c;
    private JButton b[];
    private FlowLayout fout;
    FlowLayout1()
    {
        method();
    }
    public void method(){
        
        c=this.getContentPane();
        fout=new FlowLayout(FlowLayout.LEFT,30,15);
        c.setBackground(Color.yellow);
        c.setLayout(fout);
        
        b=new JButton[9];
        
        for(int i=0;i<9;i++)
        {
            b[i]=new JButton(""+(i+1));
            c.add(b[i]);
        }
        
        
    }
       
    public static void main(String[] args) {
        FlowLayout1 a=new FlowLayout1();
        a.setVisible(true);
        a.setBounds(100,100,500,400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setTitle("FlowLayout");
        //a.setResizable(false);
    }
    
}
