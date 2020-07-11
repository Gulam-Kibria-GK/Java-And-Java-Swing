package JoptionPaneClass;

import javax.swing.JOptionPane;

public class ShowInputDialog2 {
    public static void main(String[] args) {
        String s=JOptionPane.showInputDialog(null,"Enter your first name","palash",3);
        String s1=JOptionPane.showInputDialog("Enter your last name");
        
        String sa=s+" "+s1;
        JOptionPane.showMessageDialog(null,"your full name :"+sa);
    }
}
