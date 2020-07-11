package JBoutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button3_Cursor_Change extends JFrame{
        private Container c;
   private JButton b,b1;
   private Cursor cr;
   private Font t;
   
    public Button3_Cursor_Change(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        cr=new Cursor(Cursor.HAND_CURSOR);
        
        t=new Font("Arobic",Font.BOLD+Font.ITALIC,18);
        
        b=new JButton("login");
        b.setBounds(10,10,100,50);
        b.setBackground(Color.GREEN);
        b.setForeground(Color.RED);
        b.setToolTipText("login");
        b.setCursor(cr);
        b.setFont(t);
        c.add(b);
        b1=new JButton("logout");
        b1.setBounds(130,10,100,50);
        b1.setBackground(Color.GREEN);
        b1.setToolTipText("logout");
        b1.setFont(t);
        b1.setCursor(cr);
        b1.setForeground(Color.RED);
        c.add(b1);
        
        
    }
    
    
    public static void main(String[] args) {
        Button3_Cursor_Change f=new Button3_Cursor_Change();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
