package JBoutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button4_ImageSet extends JFrame{
          private Container c;
   private JButton b,b1;
   private Cursor cr;
   private Font t;
   private ImageIcon im1,im2;
   
    public Button4_ImageSet(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        cr=new Cursor(Cursor.HAND_CURSOR);
        
        t=new Font("Arobic",Font.BOLD+Font.ITALIC,18);
        
        im1=new ImageIcon(getClass().getResource("images.png"));
        im2=new ImageIcon(getClass().getResource("index.jpg"));
        
        b=new JButton(im1);
        b.setBounds(10,10,300,150);
        b.setBackground(Color.GREEN);
        b.setForeground(Color.RED);
        b.setToolTipText("login");
        b.setCursor(cr);
        b.setFont(t);
        c.add(b);
        b1=new JButton(im2);
        b1.setBounds(320,10,300,150);
        b1.setBackground(Color.GREEN);
        b1.setToolTipText("logout");
        b1.setFont(t);
        b1.setCursor(cr);
        b1.setForeground(Color.RED);
        c.add(b1);
        
        
    }
    
    
    public static void main(String[] args) {
        Button4_ImageSet f=new Button4_ImageSet();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,1000,800);
        f.setTitle("Text Frame");
        
    }
}
