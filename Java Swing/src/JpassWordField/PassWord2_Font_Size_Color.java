package JpassWordField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PassWord2_Font_Size_Color extends JFrame{
    private Container c;
    private JTextField t1,t2;
    private JPasswordField pf;
    private Font t;
    
    PassWord2_Font_Size_Color()
    {
        metod();
    }
    public void metod()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        t=new Font("Arobic",Font.BOLD+Font.ITALIC,18);
        
        pf=new JPasswordField();
        pf.setEchoChar('*');
        pf.setForeground(Color.RED);
        pf.setBackground(Color.GREEN);
        pf.setFont(t);
        pf.setBounds(10,10,150,30);
        c.add(pf);
//        t1=new JTextField();
//        t1.setBounds(50,50,200,50);
//        c.add(t1);
//        
//        t2=new JTextField("");
//        t2.setBounds(50,105,200,50);
//        c.add(t2);
    }
    
    
    public static void main(String[] args) {
        PassWord2_Font_Size_Color f=new PassWord2_Font_Size_Color();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
