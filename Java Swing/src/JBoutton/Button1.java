
package JBoutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 extends JFrame{
   private Container c;
   private JButton b,b1;
    public Button1(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        b=new JButton("login");
        b.setBounds(10,10,100,50);
        b.setBackground(Color.GREEN);
        b.setForeground(Color.RED);
        c.add(b);
        b1=new JButton("logout");
        b1.setBounds(130,10,100,50);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.RED);
        c.add(b1);
        
        
    }
    
    
    public static void main(String[] args) {
        Button1 f=new Button1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
