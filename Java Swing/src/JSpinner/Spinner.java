package JSpinner;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spinner extends JFrame implements ChangeListener{
   private Container c;
   private JButton b,b1;
   private JSpinner sp;
   private JLabel l;
   
    public Spinner(){
        
        method();
    
    }
    public void method()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
         SpinnerNumberModel v=new SpinnerNumberModel(0,0,100,5);

        sp=new JSpinner(v);
        sp.setBounds(10,10,100,50);
        sp.setBackground(Color.yellow);
        c.add(sp); 
        sp.addChangeListener(this);
        
        l=new JLabel();
        l.setBounds(50,90,400,200);
        l.setOpaque(true);
        l.setBackground(Color.PINK);
        c.add(l);
    }
     @Override
    public void stateChanged(ChangeEvent ce) {
        
        
        
        String valu=sp.getValue().toString();
        int va=Integer.parseInt(valu);
        l.setText("Valu :-"+va);
        
    }
    
    
    public static void main(String[] args) {
        Spinner f=new Spinner();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("Text Frame");
        
    }

   
}
