
package JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{
    private Container c;  
    private JPanel tf1,tf2,tf3,tf4;
    private Font t;
    private JComboBox co1,co2,co3,co4;
    private JButton b1,b2,b3,b4;
    private String [] st={"RAD","PINK","BLACK","BLUE","GREEN","GRAY","WHITE"};

    Panel() {
        method();
    }

    public void method() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        t = new Font("Arobic", Font.BOLD + Font.ITALIC, 16);
        
        tf1 = new JPanel();
        tf1.setBackground(Color.RED);
        tf1.setToolTipText("RAD");
        tf1.setBounds(10,10,200,200);
        tf1.setFont(t);
        tf1.setForeground(Color.BLACK);
        c.add(tf1);
        tf2 = new JPanel();
        tf2.setBackground(Color.BLUE);
        tf2.setToolTipText("BLUE");
        tf2.setBounds(210,10,200,200);
        tf2.setFont(t);
        tf2.setForeground(Color.BLACK);
        c.add(tf2);
        tf3 = new JPanel();
        tf3.setBackground(Color.GREEN);
        tf3.setToolTipText("GREEN");
        tf3.setBounds(10,210,200,200);
        tf3.setFont(t);
        tf3.setForeground(Color.BLACK);
        c.add(tf3);
        tf4 = new JPanel();
        tf4.setBackground(Color.PINK);
        tf4.setToolTipText("PINK");
        tf4.setBounds(210,210,200,200);
        tf4.setFont(t);
        tf4.setForeground(Color.BLACK);
        c.add(tf4);
        
        co1=new JComboBox(st);
        co1.setBackground(Color.yellow);
        co1.setEditable(true);
        co1.setFont(t);
        tf1.add(co1);
        co2=new JComboBox(st);
        co2.setBackground(Color.yellow);
        co2.setEditable(true);
        co2.setFont(t);
        tf2.add(co2);
        co3=new JComboBox(st);
        co3.setBackground(Color.yellow);
        co3.setEditable(true);
        co3.setFont(t);
        tf3.add(co3);
        co4=new JComboBox(st);
        co4.setBackground(Color.yellow);
        co4.setEditable(true);
        co4.setFont(t);
        tf4.add(co4);
        
        b1=new JButton("OK");
        b1.setBackground(Color.yellow);
        tf1.add(b1);
        b2=new JButton("OK");
        b2.setBackground(Color.yellow);
        tf2.add(b2);
        b3=new JButton("OK");
        b3.setBackground(Color.yellow);
        tf3.add(b3);
        b4=new JButton("OK");
        b4.setBackground(Color.yellow);
        tf4.add(b4);
        
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(co1.getSelectedItem().toString() =="RAD")
                  {
                      tf1.setBackground(Color.RED);
                      tf1.setToolTipText("RAD");
                  }
                  else if(co1.getSelectedItem().toString() =="PINK")
                  {
                      tf1.setBackground(Color.PINK);
                      tf1.setToolTipText("PINK");
                  }
                  else if(co1.getSelectedItem().toString() =="BLACK")
                  {
                       tf1.setBackground(Color.BLACK);
                       tf1.setToolTipText("BLACK");
                  }
                  else if(co1.getSelectedItem().toString() =="BLUE")
                  {
                       tf1.setBackground(Color.BLUE);
                       tf1.setToolTipText("BLUE");
                  }
                  else if(co1.getSelectedItem().toString() =="GREEN")
                  {
                       tf1.setBackground(Color.GREEN);
                       tf1.setToolTipText("GREEN");
                  }
                  else if(co1.getSelectedItem().toString() =="GRAY")
                  {
                       tf1.setBackground(Color.GRAY);
                       tf1.setToolTipText("GRAY");
                  }
                  else if(co1.getSelectedItem().toString() =="WHITE")
                  {
                       tf1.setBackground(Color.WHITE);
                       tf1.setToolTipText("WHITE");
                  }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(co2.getSelectedItem().toString() =="RAD")
                  {
                      tf2.setBackground(Color.RED);
                       tf2.setToolTipText("RAD");
                  }
                  else if(co2.getSelectedItem().toString() =="PINK")
                  {
                      tf2.setBackground(Color.PINK);
                       tf2.setToolTipText("PINK");
                  }
                  else if(co2.getSelectedItem().toString() =="BLACK")
                  {
                       tf2.setBackground(Color.BLACK);
                        tf2.setToolTipText("BLACK");
                  }
                  else if(co2.getSelectedItem().toString() =="BLUE")
                  {
                       tf2.setBackground(Color.BLUE);
                        tf2.setToolTipText("BLUE");
                  }
                  else if(co2.getSelectedItem().toString() =="GREEN")
                  {
                       tf2.setBackground(Color.GREEN);
                        tf2.setToolTipText("GREEN");
                  }
                  else if(co2.getSelectedItem().toString() =="GRAY")
                  {
                       tf2.setBackground(Color.GRAY);
                        tf2.setToolTipText("GRAY");
                  }
                  else if(co2.getSelectedItem().toString() =="WHITE")
                  {
                       tf2.setBackground(Color.WHITE);
                        tf2.setToolTipText("WHITE");
                  }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(co3.getSelectedItem().toString() =="RAD")
                  {
                      tf3.setBackground(Color.RED);
                      tf3.setToolTipText("RAD");
                  }
                  else if(co3.getSelectedItem().toString() =="PINK")
                  {
                      tf3.setBackground(Color.PINK);
                      tf3.setToolTipText("PINK");
                  }
                  else if(co3.getSelectedItem().toString() =="BLACK")
                  {
                       tf3.setBackground(Color.BLACK);
                       tf3.setToolTipText("BLACK");
                  }
                  else if(co3.getSelectedItem().toString() =="BLUE")
                  {
                       tf3.setBackground(Color.BLUE);
                       tf3.setToolTipText("BLUE");
                  }
                  else if(co3.getSelectedItem().toString() =="GREEN")
                  {
                       tf3.setBackground(Color.GREEN);
                       tf3.setToolTipText("GREEN");
                  }
                  else if(co3.getSelectedItem().toString() =="GRAY")
                  {
                       tf3.setBackground(Color.GRAY);
                       tf3.setToolTipText("GRAY");
                  }
                  else if(co3.getSelectedItem().toString() =="WHITE")
                  {
                       tf3.setBackground(Color.WHITE);
                       tf3.setToolTipText("WHITE");
                  }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if(co4.getSelectedItem().toString() =="RAD")
                  {
                      tf4.setBackground(Color.RED);
                      tf4.setToolTipText("RAD");
                  }
                  else if(co4.getSelectedItem().toString() =="PINK")
                  {
                      tf4.setBackground(Color.PINK);
                      tf4.setToolTipText("PINK");
                  }
                  else if(co4.getSelectedItem().toString() =="BLACK")
                  {
                       tf4.setBackground(Color.BLACK);
                       tf4.setToolTipText("BLACK");
                  }
                  else if(co4.getSelectedItem().toString() =="BLUE")
                  {
                       tf4.setBackground(Color.BLUE);
                       tf4.setToolTipText("BLUE");
                  }
                  else if(co4.getSelectedItem().toString() =="GREEN")
                  {
                       tf4.setBackground(Color.GREEN);
                       tf4.setToolTipText("GREEN");
                  }
                  else if(co4.getSelectedItem().toString() =="GRAY")
                  {
                       tf4.setBackground(Color.GRAY);
                       tf4.setToolTipText("GRAY");
                  }
                  else if(co4.getSelectedItem().toString() =="WHITE")
                  {
                       tf4.setBackground(Color.WHITE);
                       tf4.setToolTipText("WHITE");
                  }
            }
        });
        
    }
    
   public static void main(String[] args) {
        Panel f = new Panel();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10, 20, 430, 450);
        f.setTitle("Panel");
        f.setResizable(false);

    }
}
