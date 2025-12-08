import javax.swing.*;
public class Lab401 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your full name:");
        while (true) {
            int index = name.indexOf(" ");
            if (index > 0 && index < name.length() - 1) {
                String first_name = name.substring(0, index);
                String last_name = name.substring(index + 1);
                if (!last_name.contains(" ") && !first_name.equals("") && !last_name.equals("")) {
                    String total_firstname = first_name.substring(0,1).toUpperCase() + first_name.substring(1).toLowerCase();
                    String total_lastname = last_name.toUpperCase();
                    JOptionPane.showMessageDialog(null, "Welcome, " + total_firstname + " " + total_lastname);
                    break;
                }
            }
            name = JOptionPane.showInputDialog("Enter your full name:");
        }
    }
}