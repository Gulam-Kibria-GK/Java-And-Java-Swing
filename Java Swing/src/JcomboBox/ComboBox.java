package JcomboBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComboBox extends JFrame {

    private Container c;
    private Font t;
    private JTextArea a;
    private JMenu b11, b12, b22;
    private JScrollPane s;
    private JButton b;
    private JComboBox co, co1;
    private String[] st = {"C", "C++", "JAVA", "PYTHON", "PHP"};
    private JTextArea tf;
    private JButton bb;

    ComboBox() {
        method();
    }

    public void method() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        setTitle("Frame");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        co = new JComboBox(st);
        co.setBackground(Color.PINK);
        co.setBounds(10, 20, 150, 50);
        //co.setSelectedIndex(3);
        co.setSelectedItem("JAVA");
        co.setEditable(true);
        co.addItem("HTML");
        co.addItem("BASIC");
        co.removeItem("HTML");
        co.removeItemAt(0);
        //co.removeAllItems();
        c.add(co);

        t = new Font("Arobic", Font.BOLD + Font.ITALIC, 16);

        tf = new JTextArea();
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setText("Total item " + co.getItemCount() + "\n");
        tf.setFont(t);
//      tf.setLineWrap(true);
        tf.setWrapStyleWord(true);
        tf.setToolTipText("Enter Your Text");
        tf.setForeground(Color.BLACK);

        s = new JScrollPane(tf, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s.setBounds(5, 170, 450, 300);
        c.add(s);
        
        bb=new JButton("Enter");
        bb.setBounds(170,20,100,50);
        bb.setBackground(Color.GREEN);
        bb.setForeground(Color.RED);
        c.add(bb);
        
        b11 = new JMenu("File");
        b11.setFont(t);
        b11.setBackground(Color.gray);
        b11.setForeground(Color.BLACK);
        b11.setBounds(5, 145, 55, 25);
        c.add(b11);
        b12 = new JMenu("Edit");
        b12.setFont(t);
        b12.setBackground(Color.gray);
        b12.setForeground(Color.BLACK);
        b12.setBounds(65, 145, 50, 25);
        c.add(b12);
        b22 = new JMenu("Help");
        b22.setFont(t);
        b22.setBackground(Color.gray);
        b22.setForeground(Color.BLACK);
        b22.setBounds(120, 145, 60, 25);
        c.add(b22);

        b = new JButton("Clear");
        b.setFont(t);
        b.setBackground(Color.gray);
        b.setForeground(Color.BLACK);
        b.setBounds(190, 490, 100, 50);
        c.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                tf.setText("");
            }
        });

        bb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                if (co.getSelectedItem().toString() == st[1]) {
                    tf.append("C++\n");
                } else if (co.getSelectedItem().toString() == st[2]) {
                    tf.append("JAVA\n");
                } else if (co.getSelectedItem().toString() == st[3]) {
                    tf.append("PYTHON\n");
                } else if (co.getSelectedItem().toString() == st[4]) {
                    tf.append("PHP\n");
                } else if (co.getSelectedItem().toString() == "BASIC") {
                    tf.append("BASIC\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        ComboBox f = new ComboBox();
        f.setVisible(true);

    }
}
