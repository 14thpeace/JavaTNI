package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusOrange extends JFrame {
    private JPanel panel1;
    private JTextField InputDistance;
    private JButton calculateButton;
    private JButton backButton;

    public BusOrange() {
        setContentPane(panel1);
        setTitle("BusOrange");
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

                    //  คิดราคาตามระยะ
                    if (distance <= 4) {
                        price = 12;
                    } else if (distance <= 8) {
                        price = 14;
                    } else if (distance <= 12) {
                        price = 16;
                    } else if (distance <= 16) {
                        price = 18;
                    } else {
                        price = 20;
                    }

                    //  เวลาเดินทาง
                    double speed = 25.0;
                    double timeHour = distance / speed;

                    int hour = (int) timeHour;
                    int minute = (int) ((timeHour - hour) * 60);

                    JOptionPane.showMessageDialog(null,
                            "Transport: Bus (Orange) 🚌\n" +
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
