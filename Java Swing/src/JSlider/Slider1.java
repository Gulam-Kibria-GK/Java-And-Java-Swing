package JSlider;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Slider1 extends JFrame{
   private Container c;
   private JSlider sl;
   
    public Slider1(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        sl=new JSlider(0,50,0);
        sl.setBackground(Color.PINK);
        sl.setForeground(Color.BLUE);
        sl.setMinorTickSpacing(1);
        sl.setMajorTickSpacing(5);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        sl.setBounds(10,10,400,50);
        c.add(sl);
        
        
    }
    
    
    public static void main(String[] args) {
        Slider1 f=new Slider1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }
}
