package Jlabel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel extends JFrame{
    private Container s;
    private JLabel l;
    Jlabel(){
        metod();
    }
    public void metod()
    {
        s =this.getContentPane();
        s.setLayout(null);
        s.setBackground(Color.ORANGE);
        
        l =new JLabel();
        l.setText("Enter your name :");
        l.setBounds(10,1,120,80);
        s.add(l);
    }
    public static void main(String[] args) {
        Jlabel f=new Jlabel();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300,200,400,300);
        f.setTitle("Windos");
    }
}
