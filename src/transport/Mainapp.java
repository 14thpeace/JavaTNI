package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainapp extends JFrame {
    private JPanel panel1;
    private JButton linkStartButton;

    public Mainapp() {
        setContentPane(panel1);
        setTitle("TransportCalcutor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);

        linkStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectTransport st = new SelectTransport();
                st.setVisible(true);

                dispose(); // ✅ ปิดหน้าปัจจุบัน (ถูกต้องแล้ว)
            }
        });
    }

    public static void main(String[] args) {
        new Mainapp().setVisible(true); // ✅ แบบที่ถูกต้อง
    }
}