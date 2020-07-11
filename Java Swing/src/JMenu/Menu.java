package JMenu;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame implements ActionListener{

    private JMenu m1,m2,m3;
    private Container c;
    private JMenuBar mm;
    private JMenuItem b1,b2,b3,b4,b5;

    public Menu() {
        add();
    }

    public void add() {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        mm=new JMenuBar();
        this.setJMenuBar(mm);
        
        m1=new JMenu("Home");
        m2=new JMenu("FIle");
        m3=new JMenu("Edit");
        mm.add(m1);
        mm.add(m2);
        mm.add(m3);
        
        
        b1=new JMenuItem("New");
        b2=new JMenuItem("Copy");
        b3=new JMenuItem("Cut");
        b4=new JMenuItem("Add");
        b5=new JMenuItem("Exit");
        m2.add(b1);
        m2.add(b2);
        m2.add(b3);
        m2.add(b4);
        m2.add(b5);
        
        b1.addActionListener(this);
        b5.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
            JFrame newframe=new JFrame();
            newframe.setVisible(true);
            newframe.setBounds(100,100,400,300);
            newframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        }
        else
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Menu f = new Menu();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300, 200, 400, 300);
        f.setTitle("Frame");
        f.setResizable(false);

    }

    
}
