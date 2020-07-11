package JoptionPaneClass;

import javax.swing.JOptionPane;

public class ShowMessageDialog2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"wrong password","Warning",2);//JOptionPane.QUESTION_MESSAGE=3//
        //JOptionPane.showMessageDialog(null,"wrong password","Warning",3);same JOptionPane.showMessageDialog(null,"wrong password","Warning",JOptionPane.QUESTION_MESSAGE);//
    }
}
