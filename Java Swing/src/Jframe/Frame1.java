package Jframe;

import javax.swing.JFrame;
//public class Frame1 extends JFrame{
// Frame1 f=new Frame1();...}
public class Frame1{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(400,300);
        //f.setLocationRelativeTo(null);
        //f.setLocation(300,200);
        f.setBounds(300,200,400,300);
        f.setTitle("Frame");
        f.setResizable(false);
    }
}
