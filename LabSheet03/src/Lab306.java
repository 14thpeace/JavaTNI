import javax.swing.*;
import java.util.Scanner;

public class Lab306 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter an Integer number:");
        int n = Integer.parseInt(input);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        JOptionPane.showMessageDialog(null, "Summation of 1 to " + n + " is " + sum);
    }
}
