package JLayout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayout1  extends JFrame implements ActionListener{
    private Container c;
    private JButton b1,b2,b3,b4,b5;
    private CardLayout cout;
    
    
    CardLayout1() {
        sof();
    }

    public void sof() {
        
        c=this.getContentPane();
        cout=new CardLayout(10,5);
        cout.setHgap(10);
        cout.setVgap(5);
        c.setLayout(cout);
        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        
        c.add(b1,"1st");
        c.add(b2,"2nd");
        c.add(b3,"3rd");
        c.add(b4,"4nd");
        c.add(b5,"5nd");
        cout.show(c,"3rd");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        cout.next(c);
        //cout.show(c,"3nd");
       // cout.last(c);
    }

    public static void main(String[] args) {
        CardLayout1 a=new CardLayout1();
        a.setVisible(true);
        a.setBounds(100,100,500,400);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setTitle("Layout");
        a.setResizable(false);
        
    }

    
}
