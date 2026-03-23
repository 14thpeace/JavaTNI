package transport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainapp extends JFrame {
    private JPanel panel1;
    private JButton linkStartButton;
    private JLabel logoLabel;

    public Mainapp() {
        setContentPane(panel1);
        setTitle("TransportCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        //  ใส่รูป + ปรับขนาด
        ImageIcon icon = new ImageIcon("src/transport/TNI.jpg");

        logoLabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {

                int labelWidth = logoLabel.getWidth();
                int labelHeight = logoLabel.getHeight();

                int imgWidth = icon.getIconWidth();
                int imgHeight = icon.getIconHeight();

                double widthRatio = (double) labelWidth / imgWidth;
                double heightRatio = (double) labelHeight / imgHeight;
                double ratio = Math.min(widthRatio, heightRatio);


                ratio = Math.min(ratio, 0.6);

                int newWidth = (int) (imgWidth * ratio);
                int newHeight = (int) (imgHeight * ratio);

                Image scaled = icon.getImage().getScaledInstance(
                        newWidth, newHeight, Image.SCALE_SMOOTH
                );

                logoLabel.setIcon(new ImageIcon(scaled));
            }
        });

        // ปุ่มกดไปหน้าใหม่
        linkStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectTransport st = new SelectTransport();
                st.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Mainapp().setVisible(true);
    }
}