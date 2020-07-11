package Jframe;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameIconChange extends JFrame{

    private ImageIcon icon;
    public FrameIconChange() {
        add();
    }
    public void add()
    {
        icon=new ImageIcon(getClass().getResource("sign-check-icon.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        FrameIconChange f=new FrameIconChange();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,200,400,300);
        f.setTitle("Frame");
        f.setResizable(false);
        
    }
}
