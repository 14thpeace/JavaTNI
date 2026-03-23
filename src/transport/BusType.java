package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusType extends JFrame {
    private JPanel panel1;
    private JButton selectBlueButton;
    private JButton selectOrangeButton;
    private JButton selectRedButton;
    private JButton backButton;

    BusType(){
        setContentPane(panel1);
        setTitle("BusType");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        selectRedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusRed busRed = new BusRed();
                busRed.setVisible(true);
                dispose();
            }
        });

        selectOrangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusOrange busOrange = new BusOrange();
                busOrange.setVisible(true);
                dispose();
            }
        });



        selectBlueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusBlue busBlue = new BusBlue();
                busBlue.setVisible(true);
                dispose();
            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectTransport st = new SelectTransport();
                st.setVisible(true);
                dispose();
            }
        });


    }
}
