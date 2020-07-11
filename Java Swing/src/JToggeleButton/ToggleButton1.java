package JToggeleButton;

import Jlabel.Jlabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
 
public class ToggleButton1 extends JFrame implements ActionListener{
   private Container c;
   private JToggleButton  tb;
   private JLabel l;
   private ImageIcon im;
   
    public ToggleButton1(){
        method();
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
      //  im=new ImageIcon("src/JcomboBox/index.jpg");
      
      
//        Image ic=im.getImage();
//        Image imgg=ic.getScaledInstance(tb.getWidth(),tb.getHeight(),Image.SCALE_SMOOTH);
//        im=new ImageIcon(imgg);
        
        tb =new JToggleButton(im);
        tb.setBounds(220,10,100,50);
        tb.setBackground(Color.ORANGE);
        c.add(tb);
        
        l=new JLabel("Selected");
        l.setBounds(10,10,200,50);
        l.setVisible(false);
        l.setOpaque(true);
        l.setBackground(Color.yellow);
        c.add(l);
      tb.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(tb.isSelected()){
            l.setVisible(true);
            tb.setText("ON");
        }
        else
        {
            l.setVisible(false);
            tb.setText("OFF");
        }
    }
    
    public static void main(String[] args) {
        ToggleButton1 f=new ToggleButton1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
    }

    
}
