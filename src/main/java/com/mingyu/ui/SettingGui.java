package com.mingyu.ui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SettingGui {
    private JPanel panel1;

    public SettingGui() {
        JFrame frame = new JFrame("SettingGui");
        frame.setContentPane(new SettingGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String name = textField1.getText().toString();
                String ip = textField2.getText().toString();
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
}
