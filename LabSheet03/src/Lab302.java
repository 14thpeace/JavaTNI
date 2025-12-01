import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm): "));

        int gender_male = JOptionPane.showConfirmDialog(null, "Are you biological gander is Male?",
                "Gender", JOptionPane.YES_NO_OPTION);

        if (gender_male == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Hello, Mr." + name + "\nIf your height is " + height + " cm.\nYour weight should be " + (height - 100) + " kg.");
        } else {
            int gender_female = JOptionPane.showConfirmDialog(null, "Are you biological gander is Female?",
                    "Gender", JOptionPane.YES_NO_OPTION);
            if (gender_female == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Hello, Ms." + name + "\nIf your height is " + height + " cm.\nYour weight should be " + (height - 110) + " kg.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
            }
        }
    }
}