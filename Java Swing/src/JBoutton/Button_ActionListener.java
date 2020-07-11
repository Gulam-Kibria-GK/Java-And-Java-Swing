package JBoutton;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Button_ActionListener extends JFrame{
   private Container c;
    private JLabel l1, l2;
    private JTextField tf;
    private Button b,b1;
    private JPasswordField pf;
    private Font t;

    Button_ActionListener() {
        method();
    }

    public void method() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        t = new Font("Arobic", Font.BOLD + Font.ITALIC, 16);

        l1 = new JLabel("Enter Your Username :");
        l1.setForeground(Color.GRAY);
        l1.setFont(t);
        l1.setBounds(20, 50, 200, 50);
        c.add(l1);
        l2 = new JLabel("Enter Your Password :");
        l2.setForeground(Color.GRAY);
        l2.setFont(t);
        l2.setBounds(20, 120, 200, 40);
        c.add(l2);

        tf = new JTextField();
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setBounds(200, 55, 200, 40);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(t);
        tf.setToolTipText("Enter Your Username");
        tf.setForeground(Color.BLACK);
        c.add(tf);

        pf = new JPasswordField();
        pf.setBackground(Color.LIGHT_GRAY);
        pf.setBounds(200, 125, 200, 40);
        pf.setToolTipText("Enter Your Password");
        pf.setEchoChar('*');
        pf.setHorizontalAlignment(JTextField.CENTER);
        pf.setFont(t);
        pf.setForeground(Color.BLACK);
        c.add(pf);

        b = new Button("Login");
        b.setFont(t);
        b.setBackground(Color.gray);
        b.setForeground(Color.BLACK);
        b.setBounds(180, 190, 100, 50);
        c.add(b);
        
        b1 = new Button("Clear");
        b1.setFont(t);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.BLACK);
        b1.setBounds(310, 190, 100, 50);
        c.add(b1);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String ss=tf.getText();
                String dd=pf.getText();
                if(ss.equals("palash") && (dd.equals("1234"))){
                 JOptionPane.showMessageDialog(null,"Login Sucesses_Full","Login",-1);
                }
                else
                    JOptionPane.showConfirmDialog(null,"Plz Try again","Login",0);
                
                
                
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                pf.setText("");
                tf.setText("");
            }
        });

    }

    public static void main(String[] args) {
        Button_ActionListener f = new Button_ActionListener();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10, 20, 500, 400);
        f.setTitle("Login");
        f.setResizable(false);

    }
}

