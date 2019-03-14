package com.mingyu.ui;

import com.mingyu.interfaceControl.MouseOption;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class OpenDoorGui {

    private ButtonGroup groups;

    private JFrame frame;

    public OpenDoorGui() {
        frame = new JFrame("OpenDoorGui");
        frame.setContentPane(panel4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initView();
        frame.pack();
    }

    public void show() {
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

        btnOpen1.addMouseListener(mouseOption);// 打开门1
        btnClose1.addMouseListener(mouseOption);// 关门1
        btnOpen2.addMouseListener(mouseOption);// 开门2
        btnClose2.addMouseListener(mouseOption);// 关门2
        btnOpenfirealarm.addMouseListener(mouseOption);//  打开火警
        btnClosefirealarm.addMouseListener(mouseOption);// 关闭火警
        btnOpenAlarm.addMouseListener(mouseOption);//    打开报警
        btnCloseAlarm.addMouseListener(mouseOption);//   关闭报警
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

    public MouseOption mouseOption = new MouseOption() {
        /**
         * 添加鼠标点击事件
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            if (button == btnOpen1) {

            } else if (button == btnClose1) {

            } else if (button == btnOpen2) {

            } else if (button == btnClose2) {

            } else if (button == btnOpenfirealarm) {

            } else if (button == btnClosefirealarm) {

            } else if (button == btnOpenAlarm) {

            } else if (button == btnCloseAlarm) {

            }
        }
    };

    private void createUIComponents() {
        panel4 = new JPanel();
        raddoor1 = new JRadioButton();
        raddoor2 = new JRadioButton();
        raddoor3 = new JRadioButton();
        raddoor3 = new JRadioButton();
        raddoor4 = new JRadioButton();
        raddoor5 = new JRadioButton();
        raddoor6 = new JRadioButton();
        raddoor7 = new JRadioButton();
        raddoor8 = new JRadioButton();
        raddoor9 = new JRadioButton();
        raddoor10 = new JRadioButton();
        raddoor11 = new JRadioButton();
        raddoor12 = new JRadioButton();
        raddoor13 = new JRadioButton();
        raddoor14 = new JRadioButton();
        raddoor15 = new JRadioButton();
        raddoor16 = new JRadioButton();
        btnOpen1 = new JButton();
        btnClose1 = new JButton();
        btnOpen2 = new JButton();
        btnClose2 = new JButton();
        btnOpenfirealarm = new JButton();
        btnClosefirealarm = new JButton();
        btnOpenAlarm = new JButton();
        btnCloseAlarm = new JButton();
        tvResult = new JTextArea();
    }


}
