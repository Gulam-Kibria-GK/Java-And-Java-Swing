package JBoutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button2_Font_Color_Size extends JFrame{
       private Container c;
   private JButton b,b1;
   private Font t;
   
    public Button2_Font_Color_Size(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        t=new Font("Arobic",Font.BOLD+Font.ITALIC,18);
        
        b=new JButton("login");
        b.setBounds(10,10,100,50);
        b.setBackground(Color.GREEN);
        b.setForeground(Color.RED);
        b.setToolTipText("login");
        b.setFont(t);
        c.add(b);
        b1=new JButton("logout");
        b1.setBounds(130,10,100,50);
        b1.setBackground(Color.GREEN);
        b1.setToolTipText("logout");
        b1.setFont(t);
        b1.setForeground(Color.RED);
        c.add(b1);
        
        
    }
    
    
    public static void main(String[] args) {
        Button2_Font_Color_Size f=new Button2_Font_Color_Size();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
