package com.mingyu.ui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InitialUI {
    private JPanel panel3;
    private JButton btnControl;
    private JButton btnSetting;

    public  void InitialUI() {
        JFrame frame = new JFrame("InitialUI");
        frame.setContentPane(new InitialUI().panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnControl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        btnControl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    private JButton button4;


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
