import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {

        int number = 0;

        boolean is_loop = true;

        while (is_loop){
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Input an interger number"));
                is_loop = false;
            }catch (NumberFormatException err){
                JOptionPane.showMessageDialog(null, "Error " + err.getMessage(),"Error messgae",JOptionPane.WARNING_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null,"U inputted number = " + number);
    }
}
