package transport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTransport extends JFrame  {
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
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        WALKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Walk walk = new Walk();
                walk.setVisible(true);
                dispose();
            }
        });


        motorcycleTaxiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MotorcycleTaxi motorcycleTaxi = new MotorcycleTaxi();
                motorcycleTaxi.setVisible(true);
                dispose();
            }
        });


        taxiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Taxi taxi = new Taxi();
                taxi.setVisible(true);
                dispose();
            }
        });


        busButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusType busType = new BusType();
                busType.setVisible(true);
                dispose();
            }
        });


        BTSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AirPortLink bts = new AirPortLink();
                bts.setVisible(true);
                dispose();
            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mainapp mainApp = new Mainapp();
                mainApp.setVisible(true);
                dispose();
            }
        });
    }



}
