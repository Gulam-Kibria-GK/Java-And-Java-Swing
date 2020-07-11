package JSlider;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderProject extends JFrame implements ChangeListener{
   private Container c;
   private JSlider sl,sl1,sl2;
   private JLabel l1,l2,l3,l4;
   private JTextField t1,t2,t3;
   private JPanel p;
   
    public SliderProject(){
        method();
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        l1=new JLabel("Rad");
//        l1.setOpaque(true);
//        l1.setBackground(Color.CYAN);
        l1.setForeground(Color.RED);
        l1.setBounds(10,10,60,50);
        c.add(l1);
        l2=new JLabel("Green");
//        l2.setOpaque(true);
//        l2.setBackground(Color.CYAN);
        l2.setForeground(Color.GREEN);
        l2.setBounds(10,65,60,50);
        c.add(l2);
        l3=new JLabel("Blue");
//        l3.setOpaque(true);
//        l3.setBackground(Color.CYAN);
        l3.setForeground(Color.BLUE);
        l3.setBounds(10,120,60,50);
        c.add(l3);
        
        
        t1=new JTextField();
        t1.setBounds(400,10,150,50);
        c.add(t1);
        t2=new JTextField();
        t2.setBounds(400,65,150,50);
        c.add(t2);
        t3=new JTextField();
        t3.setBounds(400,120,150,50);
        c.add(t3);
        
        p=new JPanel();
        p.setBackground(Color.WHITE);
        p.setBounds(10,190,570,200);
        c.add(p);
        
        
        l4=new JLabel("preview");
        l4.setForeground(Color.black);
        l4.setBounds(260,390,100,50);
        c.add(l4);
        
        sl=new JSlider(0,125,0);
        sl.setBackground(Color.PINK);
        sl.setForeground(Color.BLUE);
        sl.setMinorTickSpacing(1);
        sl.setMajorTickSpacing(5);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        sl.setBounds(80,10,300,50);
        c.add(sl);
        
        sl1=new JSlider(0,125,0);
        sl1.setBackground(Color.PINK);
        sl1.setForeground(Color.BLUE);
        sl1.setMinorTickSpacing(1);
        sl1.setMajorTickSpacing(5);
        sl1.setPaintTicks(true);
        sl1.setPaintLabels(true);
        sl1.setBounds(80,65,300,50);
        c.add(sl1);
        
        sl2=new JSlider(0,125,0);
        sl2.setBackground(Color.PINK);
        sl2.setForeground(Color.BLUE);
        sl2.setMinorTickSpacing(1);
        sl2.setMajorTickSpacing(5);
        sl2.setPaintTicks(true);
        sl2.setPaintLabels(true);
        sl2.setBounds(80,120,300,50);
        c.add(sl2);
        sl.addChangeListener(this);
        sl1.addChangeListener(this);
        sl2.addChangeListener(this);
        
    }
    
    
    @Override
    public void stateChanged(ChangeEvent ce) {
        
        int r=sl.getValue();
        int g=sl1.getValue();
        int b=sl2.getValue();
        
        t1.setText(""+r);
        t2.setText(""+g);
        t3.setText(""+b);
        
        Color co=new Color(r,g,b);
        p.setBackground(co);
        
    }
    
    public static void main(String[] args) {
        SliderProject f=new SliderProject();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(50,50,600,500);
        f.setTitle("Text Frame");
        f.setResizable(false);
        
    }

    
}
