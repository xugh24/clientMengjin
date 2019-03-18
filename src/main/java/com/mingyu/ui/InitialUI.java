package com.mingyu.ui;

import com.mingyu.control.Management;
import com.mingyu.control.TestManagment;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InitialUI {
    private JPanel panel3;
    private JButton btnControl;
    private JButton btnSetting;

    public InitialUI() {
        JFrame frame = new JFrame("InitialUI");
        frame.setContentPane(panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnControl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TestManagment.getInstance().showControlOpen();
            }
        });
        btnSetting.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    private JButton button4;


    private void createUIComponents() {
        panel3 = new JPanel();
        btnControl = new JButton();
        btnSetting = new JButton();
    }
}
