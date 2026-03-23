package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusBlue extends JFrame {
    private JPanel panel1;
    private JTextField InputDistance;
    private JButton calculateButton;
    private JButton backButton;

    public BusBlue() {
        setContentPane(panel1);
        setTitle("BusBlue");
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

                    double price;

                    // 💸 คิดราคา NGV
                    if (distance <= 8) {
                        price = 15;
                    } else if (distance <= 16) {
                        price = 20;
                    } else {
                        price = 25;
                    }

                    // 🚪 ทางด่วน (optional)

                    // ⏱ เวลา
                    double speed = 30.0;
                    double timeHour = distance / speed;

                    int hour = (int) timeHour;
                    int minute = (int) ((timeHour - hour) * 60);

                    JOptionPane.showMessageDialog(null,
                            "Transport: Bus (Blue NGV) 🔵🚌\n" +
                                    "Distance: " + distance + " km\n" +
                                    "Time: " + hour + " hr " + minute + " min\n" +
                                    "Price: " + price + " Baht");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                }
            }
        });
    }
}
