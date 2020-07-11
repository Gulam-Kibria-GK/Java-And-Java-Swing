package JTable;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table extends JFrame {

    private Container c;
    private JTable ta;
    private JLabel l;
    private JScrollPane sk;
    private String [] com={"ID","Name","age"};  
    private String [][] row={
        {"101","arif","19"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"101","arif","19"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"101","arif","19"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        {"102","mina","18"},
        {"103","kobir","21"},
        {"104","hanif","20"},
        {"105","sorif","18"},
        
    };
    public Table() {
        add();
    }

    public void add() {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        l=new JLabel("student data");
        l.setForeground(Color.BLUE);
        l.setBounds(165,10,200,50);
        c.add(l);
        
        ta=new JTable(row,com);
        //ta.setEnabled(false);
        ta.setBackground(Color.PINK);
        
        sk=new JScrollPane(ta);
        sk.setBounds(50,45,300,200);
        c.add(sk);
        
        
        
    }

    public static void main(String[] args) {
        Table f = new Table();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(300, 200, 400, 300);
        f.setTitle("Frame");
        f.setResizable(false);

    }
}
