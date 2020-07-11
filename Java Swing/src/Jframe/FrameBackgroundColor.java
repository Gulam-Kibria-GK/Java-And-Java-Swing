package Jframe;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameBackgroundColor extends JFrame {

    private ImageIcon icon;
    private Container c;

    public FrameBackgroundColor() {
        add();
    }

    public void add() {
        c=this.getContentPane();
        c.setBackground(Color.CYAN);
        icon = new ImageIcon(getClass().getResource("sign-check-icon.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        FrameBackgroundColor f = new FrameBackgroundColor();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300, 200, 400, 300);
        f.setTitle("Frame");
        f.setResizable(false);

    }
}
