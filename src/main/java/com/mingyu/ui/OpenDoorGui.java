package com.mingyu.ui;

import javax.swing.*;

public class OpenDoorGui {

    private ButtonGroup groups;

    public OpenDoorGui() {
        JFrame frame = new JFrame("OpenDoorGui");
        frame.setContentPane(new OpenDoorGui().panel4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initView();
        frame.pack();
        frame.setVisible(true);
    }

    private void initView() {
        groups = new ButtonGroup();
        groups.add(raddoor1);
        groups.add(raddoor2);
        groups.add(raddoor3);
        groups.add(raddoor4);

        groups.add(raddoor5);
        groups.add(raddoor6);
        groups.add(raddoor7);
        groups.add(raddoor8);

        groups.add(raddoor9);
        groups.add(raddoor10);
        groups.add(raddoor11);
        groups.add(raddoor12);

        groups.add(raddoor13);
        groups.add(raddoor14);
        groups.add(raddoor15);
        groups.add(raddoor16);
    }

    private JRadioButton raddoor1;
    private JRadioButton raddoor2;
    private JRadioButton raddoor3;
    private JRadioButton raddoor4;

    private JRadioButton raddoor5;
    private JRadioButton raddoor6;
    private JRadioButton raddoor7;
    private JRadioButton raddoor8;

    private JRadioButton raddoor9;
    private JRadioButton raddoor10;
    private JRadioButton raddoor11;
    private JRadioButton raddoor12;

    private JRadioButton raddoor13;
    private JRadioButton raddoor14;
    private JRadioButton raddoor15;
    private JRadioButton raddoor16;
    private JButton btnOpen1;
    private JButton btnClose1;
    private JButton btnOpen2;
    private JButton btnClose2;
    private JButton btnOpenfirealarm;
    private JButton btnClosefirealarm;
    private JButton btnOpenAlarm;
    private JButton btnCloseAlarm;
    private JTextArea tvResult;
    private JPanel panel4;

    private void createUIComponents() {

    }
}
