import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");
        if ( name.equalsIgnoreCase("admin") && password.equals("Admin1234"))
        {
            JOptionPane.showMessageDialog(null,"Login Success");
        }
        else
        {
            while (true)
            {
                if ( name.equalsIgnoreCase("admin") && password.equals("Admin1234"))
                {
                    JOptionPane.showMessageDialog(null,"Login Success");
                    break;
                }
                JOptionPane.showMessageDialog(null,"Login Fail...","Incorrect username or password",JOptionPane.WARNING_MESSAGE);
                name = JOptionPane.showInputDialog("Enter username:");
                password = JOptionPane.showInputDialog("Enter password:");
            }
        }
    }
}
 