import javax.swing.*;

public class Ex403 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your email");

        /*while (email.toUpperCase().endsWith("@GMAIL.COM") == false){
            email = JOptionPane.showInputDialog("Enter your email again");
        }*/

        while (email.toLowerCase().endsWith("@gmail.com") == false){
            email = JOptionPane.showInputDialog("Enter your email again");
        }

        JOptionPane.showMessageDialog(null,"ur email is " + email);

    }
}
