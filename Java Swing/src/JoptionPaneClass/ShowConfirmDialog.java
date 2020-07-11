package JoptionPaneClass;

import javax.swing.JOptionPane;

public class ShowConfirmDialog {
    public static void main(String[] args) {
        int a=JOptionPane.showConfirmDialog(null,"your name kibria?","tital",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==JOptionPane.YES_OPTION)
        {
            //System.out.println("YRS");
            JOptionPane.showMessageDialog(null,a,"tital",3);
        }
        else if(a==JOptionPane.NO_OPTION)
        {
            //System.out.println("NO");
            JOptionPane.showMessageDialog(null,a,"tital",3);
        }
        else
        {
            //System.out.println("exit");
            JOptionPane.showMessageDialog(null,a,"tital",3);
        }
            
    }
}
