package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Walk extends JFrame {
    private JPanel panel1;
    private JButton calculateButton;
    private JTextField InputDistance;
    private JButton backButton;

    public Walk() {
        setContentPane(panel1);
        setTitle("Walk");
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

                    double speed = 5.0; // km/h
                    double timeHour = distance / speed;

                    int hour = (int) timeHour;
                    int minute = (int) ((timeHour - hour) * 60);

                    // 🔥 แสดงผล (ฟรี)
                    JOptionPane.showMessageDialog(null,
                            "Transport: Walk 🚶\n" +
                                    "Distance: " + distance + " km\n" +
                                    "Time: " + hour + " hr " + minute + " min\n" +
                                    "Price: FREE (0 Baht)");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number!");
                }
            }
        });
    }
}