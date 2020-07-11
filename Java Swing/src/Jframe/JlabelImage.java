package Jframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JlabelImage extends JFrame {

    private Container c;
    private Font t;
    private JLabel l1, l2,l3 ;
    private ImageIcon m;

    JlabelImage() {
        matod();
    }

    public void matod() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        t = new Font("Arobic", Font.ITALIC + Font.BOLD, 18);

        m = new ImageIcon(getClass().getResource("sign-check-icon.png"));

//        l1 = new JLabel();
//        l1.setText("Enter your PassWord :");
//        l1.setBounds(10, 60, 150, 50);
//        l1.setOpaque(true);
//        l1.setBackground(Color.GREEN);
//        l1.setForeground(Color.RED);
//        l1.setFont(t);
//        l1.setToolTipText("Enter your passWord");
//        c.add(l1);
//
//        l2 = new JLabel("Enter Your Name :");
//        l2.setBounds(10, 5, 150, 50);
//        l2.setOpaque(true);
//        l2.setBackground(Color.blue);
//        l2.setForeground(Color.RED);
//        l2.setFont(t);
//        l2.setToolTipText("Enter your Nmae");
//        l2.add(l2);

        l3 = new JLabel(m);
        l3.setBounds(200,100,m.getIconWidth(),m.getIconHeight());
        c.add(l3);
        
    }

    public static void main(String[] args) {
        JlabelImage f = new JlabelImage();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 500);
        //f.setLocationRelativeTo(null);
        f.setLocation(300, 200);
        f.setTitle("Frame");
        f.setResizable(true);

    }
}
