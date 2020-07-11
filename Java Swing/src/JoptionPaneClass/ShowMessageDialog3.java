package JoptionPaneClass;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowMessageDialog3 {

    public static void main(String[] args) {
        ImageIcon ICON= new ImageIcon("sign-check-icon.png");
        JOptionPane.showMessageDialog(null, "Enter the PassWord", "FaceBook", JOptionPane.PLAIN_MESSAGE, ICON);
    }
}
