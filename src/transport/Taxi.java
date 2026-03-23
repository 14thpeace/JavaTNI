package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taxi extends JFrame {

    private JPanel panel1;
    private JButton backButton;
    private JButton calculateButton;
    private JTextField InputDistance;

    public Taxi() {
        setContentPane(panel1);
        setTitle("Taxi");
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

                    // 🚕 ค่าโดยสาร
                    double baseFare = 35;

                    double distanceFare = 0;
                    if (distance > 1) {
                        distanceFare = (distance - 1) * 6.5;
                    }

                    // 🚦 รถติด
                    String jamInput = JOptionPane.showInputDialog("Traffic jam (minutes, 0 if none):");
                    double jamMinutes = (jamInput == null || jamInput.isEmpty()) ? 0 : Double.parseDouble(jamInput);

                    double jamFare = jamMinutes * 3;

                    double total = baseFare + distanceFare + jamFare;

                    // ⏱ เวลาเดินทาง
                    double speed = 30.0; // km/h
                    double timeHour = distance / speed;

                    int hour = (int) timeHour;
                    int minute = (int) ((timeHour - hour) * 60);

                    // ➕ รวมเวลารถติดเข้าไป
                    minute += (int) jamMinutes;

                    // ปรับถ้านาทีเกิน 60
                    hour += minute / 60;
                    minute = minute % 60;

                    JOptionPane.showMessageDialog(null,
                            "Transport: Taxi 🚕\n" +
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
