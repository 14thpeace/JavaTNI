import javax.swing.*;
import java.text.DecimalFormat;

public class Lab304 {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight(kg.)"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm.)"));

        double heightInmeter = height / 100;
        double BMI = weight / (heightInmeter * heightInmeter);

        DecimalFormat df = new DecimalFormat("##.00");
        if (BMI >= 30 )
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + df.format(BMI) +
                            "\nBMI result is Obese"  );
       else if (BMI >= 25 )
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + df.format(BMI) +
                            "\nBMI result is Overweight"  );
        else if (BMI >= 18.5 )
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + df.format(BMI) +
                            "\nBMI result is Healthy weight"  );
        else
            JOptionPane.showMessageDialog(null,
                    "Your BMI is " + df.format(BMI) +
                            "\nBMI result is Underweight"  );





    }
}
