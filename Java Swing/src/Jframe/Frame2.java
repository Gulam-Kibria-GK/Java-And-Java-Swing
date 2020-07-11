package Jframe;

import javax.swing.JFrame;

public class Frame2 extends JFrame{
    Frame2()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,200,300,400);
        setTitle("Frame");
    }
    public static void main(String[] args) {
        Frame2  f=new Frame2 ();
        f.setVisible(true);
        
    }
}
