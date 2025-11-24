import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#,###.##");

        System.out.print("Enter number 1: ");
        double number_one = scan.nextDouble();
        System.out.print("Enter number 2: ");
        double number_two = scan.nextDouble();

        System.out.println("\nSummation = " + frm.format(number_one + number_two));
        System.out.println("Subtraction = " + frm.format(number_one - number_two));
        System.out.println("Multiplication = " + frm.format(number_one * number_two));
        double Divison = number_one / number_two;
        System.out.println("Division = " + frm.format(Divison));
        System.out.println("Modulus = " + frm.format(number_one % number_two));
    }
}
