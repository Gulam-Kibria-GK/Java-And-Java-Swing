package JColorChooser;

import Jframe.FrameBackgroundColor;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooser extends JFrame {
    private Container c;
    private JButton b;
    private JColorChooser cl;
    
    public ColorChooser() {
        add();
    }

    public void add() {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
       
        b=new JButton();
        b.setText("ColorChooser");
        b.setBackground(Color.yellow);
        b.setBounds(10 ,10,200,50);
        c.add(b);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Color cc=JColorChooser.showDialog(null,"ColorChooser", Color.yellow);
                c.setBackground(cc);
            }
        });
        
    }

    public static void main(String[] args) {
        ColorChooser f = new ColorChooser();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300, 200, 400, 300);
        f.setTitle("Frame");
        f.setResizable(false);

    }
}
