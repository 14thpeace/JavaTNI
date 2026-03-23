package transport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class SelectTransport extends JFrame {
    private JPanel panel1;
    private JButton WALKButton;
    private JButton motorcycleTaxiButton;
    private JButton taxiButton;
    private JButton busButton;
    private JButton BTSButton;
    private JButton backButton;

    public SelectTransport() {
        setContentPane(panel1);
        setTitle("SelectTransport");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== เปิดเต็มหน้าจอ =====
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // ===== ใส่รูปเริ่มต้น =====
        setButtonIcon(WALKButton, "/transport/walk1111.png");
        setButtonIcon(motorcycleTaxiButton, "/transport/bike1111.png");
        setButtonIcon(taxiButton, "/transport/taxi1111.png");
        setButtonIcon(busButton, "/transport/bus1111.png");
        setButtonIcon(BTSButton, "/transport/train1111.png");

        // ===== ตัวอย่างปุ่มกด (ใช้ lambda) =====
        WALKButton.addActionListener(e -> openWindow(new Walk()));
        motorcycleTaxiButton.addActionListener(e -> openWindow(new MotorcycleTaxi()));
        taxiButton.addActionListener(e -> openWindow(new Taxi()));
        busButton.addActionListener(e -> openWindow(new BusType()));
        BTSButton.addActionListener(e -> openWindow(new AirPortLink()));
        backButton.addActionListener(e -> openWindow(new Mainapp()));

        // ===== ปรับขนาดรูปและข้อความอัตโนมัติเมื่อขยายหน้าต่าง =====
        panel1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resizeButton(WALKButton, "/transport/walk11.jpg");
                resizeButton(motorcycleTaxiButton, "/transport/bike1.jpg");
                resizeButton(taxiButton, "/transport/taxi1.png");
                resizeButton(busButton, "/transport/bus1.jpg");
                resizeButton(BTSButton, "/transport/train11.jpg");
            }
        });
    }

    // ===== method เปิดหน้าต่างใหม่ =====
    private void openWindow(JFrame frame) {
        frame.setVisible(true);
        dispose();
    }

    // ===== method ใส่รูปปุ่มเริ่มต้น =====
    private void setButtonIcon(JButton button, String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));
        Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); // ขนาดเริ่มต้น
        button.setIcon(new ImageIcon(img));

        // จัดข้อความให้อยู่ด้านล่าง
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setIconTextGap(30); // ระยะห่างระหว่างรูปกับข้อความ

        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // ขนาดตัวอักษรเริ่มต้น
        button.setFont(button.getFont().deriveFont(18f));
    }

    // ===== method ปรับขนาดรูปและข้อความตามขนาดปุ่ม =====
    private void resizeButton(JButton button, String path) {
        ImageIcon icon = new ImageIcon(getClass().getResource(path));

        int size = 120; // 🔥 ปรับได้ (100–140 กำลังสวย)

        Image img = icon.getImage().getScaledInstance(
                size, size, Image.SCALE_SMOOTH
        );

        button.setIcon(new ImageIcon(img));

        // font เล็กลงให้บาลานซ์
        button.setFont(button.getFont().deriveFont(16f));
    }
}