package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusRed extends JFrame {
    private JPanel panel1;
    private JTextField InputDistance;
    private JButton calculateButton;
    private JButton backButton;

    public BusRed() {
        setContentPane(panel1);
        setTitle("BusRed");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusType busType = new BusType();
                busType.setVisible(true);
                dispose();
            }
        });


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double distance = Double.parseDouble(InputDistance.getText());

                    if (distance <= 0) {
                        JOptionPane.showMessageDialog(null, "Distance must be > 0");
                        return;
                    }

                    // 💸 ราคา (ตลอดสาย)
                    double price = 8;

                    // ⏱ เวลาเดินทาง
                    double speed = 25.0; // km/h
                    double timeHour = distance / speed;

                    int hour = (int) timeHour;
                    int minute = (int) ((timeHour - hour) * 60);

                    JOptionPane.showMessageDialog(null,
                            "Transport: Bus (Red) 🚌\n" +
                                    "Distance: " + distance + " km\n" +
                                    "Time: " + hour + " hr " + minute + " min\n" +
                                    "Price: " + price + " Baht (Flat rate)");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                }
            }
        });
    }
}
