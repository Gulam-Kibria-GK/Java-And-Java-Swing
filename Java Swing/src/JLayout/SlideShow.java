package JLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener {

    private Container c;
    private JButton b1, b2;
    private CardLayout cout;
    private JPanel p;
    private ImageIcon im;
    private JLabel l;

    SlideShow() {
        sof();
        image();
    }
    public void image() {
        String[] st = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg","11.jpg", "12.jpg", "13.jpg", "14.jpg", "15.jpg", "16.jpg", "17.jpg", "18.jpg", "19.jpg", "20.jpg","21.jpg", "22.jpg", "23.jpg", "24.jpg", "25.jpg", "26.jpg", "27.jpg", "28.jpg", "29.jpg", "30.jpg","31.jpg", "32.jpg", "33.jpg", "34.jpg", "35.jpg", "36.jpg"};
        for (String n : st) {
            im = new ImageIcon("src/image/" + n);

            Image img = im.getImage();
            Image rs = img.getScaledInstance(p.getWidth(), p.getHeight(), Image.SCALE_SMOOTH);

            im = new ImageIcon(rs);
            l = new JLabel(im);
            p.add(l);

        }
    }

    public void sof() {

        c = this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);

        cout = new CardLayout();

        p = new JPanel(cout);
        p.setBounds(10, 10, 900, 580);
        c.add(p);

        b1 = new JButton();
        b1.setText("Next");
        b1.setBackground(Color.cyan);
        b1.setBounds(810, 600, 100, 50);
        c.add(b1);
        b2 = new JButton();
        b2.setText("Previus");
        b2.setBackground(Color.CYAN);
        b2.setBounds(10, 600, 100, 50);
        c.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            cout.next(p);
        } else {
            cout.previous(p);
        }

    }

    public static void main(String[] args) {
        SlideShow a = new SlideShow();
        a.setVisible(true);
        a.setBounds(300, 10, 930, 700);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setTitle("ShowImage");
        a.setResizable(false);

    }

}
