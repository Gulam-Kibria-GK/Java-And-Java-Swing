package JCheckBox;

import JRadioButton.RadioButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBox extends JFrame {

    private Container c;
    private JCheckBox b1, b2, b3;
    private ButtonGroup bg;
    private Font t;
    private JTextArea a;
    private JMenu b11, b12, b22;
    private JScrollPane s;
    private Button b;

    private JTextArea tf;

    CheckBox() {
        method();
    }

    public void method() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        setTitle("Frame");

        bg = new ButtonGroup();

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        t = new Font("Arial", Font.BOLD, 20);

        b1 = new JCheckBox("C");
        b1.setBounds(10, 40, 100, 50);
        b1.setBackground(Color.ORANGE);
        //b1.setSelected(true);
        b1.setFont(t);
        c.add(b1);

        b2 = new JCheckBox("C++");
        b2.setBounds(110, 40, 100, 50);
        b2.setFont(t);
        b2.setSelected(true);
        b2.setBackground(Color.ORANGE);
        c.add(b2);

        b3 = new JCheckBox("JAVA");
        b3.setBounds(220, 40, 100, 50);
        //b3.setEnabled(false);
        b3.setFont(t);
        b3.setBackground(Color.ORANGE);
        c.add(b3);

        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        t = new Font("Arobic", Font.BOLD + Font.ITALIC, 16);

        tf = new JTextArea();
        tf.setBackground(Color.LIGHT_GRAY);

        tf.setFont(t);
//      tf.setLineWrap(true);
        tf.setWrapStyleWord(true);
        tf.setToolTipText("Enter Your Text");
        tf.setForeground(Color.BLACK);

        s = new JScrollPane(tf, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        s.setBounds(5, 170, 450, 300);
        c.add(s);

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

        b = new Button("Clear");
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

        action ac = new action();
        b1.addActionListener(ac);
        b2.addActionListener(ac);
        b3.addActionListener(ac);
    }

    class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

//            if(ae.getSource()==b1){
//                tf.append("Male\n");
//            }
//            else
//                tf.append("Famale\n");
            if (b1.isSelected()) {
                tf.append("C\n");
            } else if (b2.isSelected()) {
                tf.append("C++\n");
            }
            else
                tf.append("JAVA\n");

        }

    }

    public static void main(String[] args) {
        CheckBox f = new CheckBox();
        f.setVisible(true);

    }
}
