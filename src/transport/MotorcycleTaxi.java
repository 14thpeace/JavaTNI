package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MotorcycleTaxi extends JFrame {
    private JPanel panel1;
    private JButton calculateButton;
    private JButton backButton;
    private JTextField InputDistance;

    public MotorcycleTaxi() {
        setContentPane(panel1);
        setTitle("Motorcycle Taxi");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectTransport selectTransport = new SelectTransport();
                selectTransport.setVisible(true);
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

                    double total = 0;

                    if (distance <= 2) {
                        total = 25;
                    }
                    else if (distance <= 5) {
                        total = 25 + (distance - 2) * 5;
                    }
                    else {
                        total = 25 + (3 * 5) + (distance - 5) * 10;
                    }


                    // ⏱ เวลา (วินเร็ว)
                    double speed = 40.0;
                    double timeHour = distance / speed;

                    int hour = (int) timeHour;
                    int minute = (int) ((timeHour - hour) * 60);

                    JOptionPane.showMessageDialog(null,
                            "Transport: Motorcycle Taxi 🏍\n" +
                                    "Distance: " + distance + " km\n" +
                                    "Time: " + hour + " hr " + minute + " min\n" +
                                    "Price: " + String.format("%.2f", total) + " Baht");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                }
            }
        });
    }
}

