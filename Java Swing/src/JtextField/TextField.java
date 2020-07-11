package JtextField;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField extends JFrame{
    private Container c;
    private JTextField t1,t2;
    TextField()
    {
        metod();
    }
    public void metod()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        t1=new JTextField();
        t1.setBounds(50,50,200,50);
        c.add(t1);
        
        t2=new JTextField("enter your name ");
        t2.setBounds(50,105,200,50);
        c.add(t2);
    }
    
    
    public static void main(String[] args) {
        TextField f=new TextField();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
