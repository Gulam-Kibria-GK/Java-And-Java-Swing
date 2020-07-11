package JtextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextField_ActionLister extends JFrame {

    private Container c;
    private JTextField t1, t2;
    private Font t;

    TextField_ActionLister() {
        metod();
    }

    public void metod() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        t = new Font("Arobic", Font.BOLD + Font.ITALIC, 16);

        t1 = new JTextField();
        t1.setBounds(50, 50, 200, 50);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setBackground(Color.GREEN);
        t1.setForeground(Color.RED);
        t1.setFont(t);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(50, 105, 200, 50);
        t2.setHorizontalAlignment(JTextField.RIGHT);
        t2.setFont(t);
        t2.setBackground(Color.ORANGE);
        t2.setForeground(Color.RED);
        c.add(t2);

        t1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent a)
               {
                   String s=t1.getText();
                   JOptionPane.showMessageDialog(null,s);
               }
            
            
            
        });
        t2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent a)
               {
                   String s=t1.getText();
                   JOptionPane.showMessageDialog(null,s);
               }
            
            
            
        });
    }

    public static void main(String[] args) {
        TextField_ActionLister f = new TextField_ActionLister();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 50, 500, 400);
        f.setTitle("Text Frame");

    }
}
