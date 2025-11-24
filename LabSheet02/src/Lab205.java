import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
            int Input_minutes = Integer.parseInt(
                    JOptionPane.showInputDialog("Input minutes:"));
            int hour = Input_minutes / 60;
            int minutes = Input_minutes % 60;
            JOptionPane.showMessageDialog(null,
                    Input_minutes + " minutes is a " +  hour +" hour "+ minutes + " minute");
    }
}
