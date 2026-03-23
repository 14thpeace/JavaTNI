package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirPortLink extends JFrame {
    private JPanel panel1;
    private JButton phayaThaiButton;
    private JButton backButton;
    private JButton makkasanButton;
    private JButton huaMakButton;
    private JButton latKrabangButton;
    private JButton suvarnabhumiButton;
    private JButton banThapChangButton;
    private JButton ramkhamhaengButton;
    private JButton ratchapraropButton;

    public AirPortLink(){
        setContentPane(panel1);
        setTitle("Airport Rail Link");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        suvarnabhumiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 15; // km (ประมาณ)
                int stations = 3;
                int minute = stations * 3;
                int price = 30;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Suvarnabhumi → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });
        latKrabangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 10;
                int stations = 2;
                int minute = stations * 3;
                int price = 25;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Lat Krabang → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });
        banThapChangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 5;
                int stations = 1;
                int minute = stations * 3;
                int price = 20;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Ban Thap Chang → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });
        huaMakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "You are already at Hua Mak station 🚉\n" +
                                "Distance: 0 km\n" +
                                "Time: 0 min\n" +
                                "Price: 0 Baht");
            }
        });
        ramkhamhaengButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 4;
                int stations = 1;
                int minute = stations * 3;
                int price = 20;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Ramkhamhaeng → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });
        makkasanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 8;
                int stations = 2;
                int minute = stations * 3;
                int price = 25;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Makkasan → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });
        ratchapraropButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 10;
                int stations = 3;
                int minute = stations * 3;
                int price = 30;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Ratchaprarop → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });
        phayaThaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 12;
                int stations = 4;
                int minute = stations * 3;
                int price = 35;

                JOptionPane.showMessageDialog(null,
                        "Transport: Airport Rail Link 🚆\n" +
                                "From: Phaya Thai → Hua Mak\n" +
                                "Distance: " + distance + " km\n" +
                                "Time: " + minute + " min\n" +
                                "Price: " + price + " Baht");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectTransport selectTransport = new SelectTransport();
                selectTransport.setVisible(true);
                dispose();
            }
        });
    }
}
