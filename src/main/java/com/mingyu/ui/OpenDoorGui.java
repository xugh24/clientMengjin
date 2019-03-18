package com.mingyu.ui;

import com.mingyu.control.TestManagment;
import com.mingyu.interfaceControl.MouseOption;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class OpenDoorGui {

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

    private JFrame frame;

    private List<JRadioButton> radios;


    public OpenDoorGui() {
        frame = new JFrame("OpenDoorGui");
        frame.setContentPane(panel4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        initView();
    }

    public void show() {
        frame.setVisible(true);
    }

    private void initView() {
        addradio();
        for (JRadioButton btn : radios) {
            btn.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    JRadioButton radiobtn1 = (JRadioButton) e.getSource();
                    if (radiobtn1.isSelected()) {
                        TestManagment.getInstance().setTempRadioButton(radiobtn1);
                        tvResult.setText("当面选中门 : " + radiobtn1.getText());
                    }
                }
            });
        }
        TestManagment.getInstance().bindRadio(radios);
        btnOpen1.addMouseListener(mouseOption);// 打开门1
        btnClose1.addMouseListener(mouseOption);// 关门1
        btnOpen2.addMouseListener(mouseOption);// 开门2
        btnClose2.addMouseListener(mouseOption);// 关门2
        btnOpenfirealarm.addMouseListener(mouseOption);//  打开火警
        btnClosefirealarm.addMouseListener(mouseOption);// 关闭火警
        btnOpenAlarm.addMouseListener(mouseOption);//    打开报警
        btnCloseAlarm.addMouseListener(mouseOption);//   关闭报警
    }


    public MouseOption mouseOption = new MouseOption() {
        /**
         * 添加鼠标点击事件
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            if (button == btnOpen1) {
                TestManagment.getInstance().openDoor(1);
            } else if (button == btnClose1) {
                TestManagment.getInstance().closeDoor(1);
            } else if (button == btnOpen2) {
                TestManagment.getInstance().openDoor(2);
            } else if (button == btnClose2) {
                TestManagment.getInstance().closeDoor(2);
            } else if (button == btnOpenfirealarm) {
                TestManagment.getInstance().openAlarm(1);
            } else if (button == btnClosefirealarm) {
                TestManagment.getInstance().closeDoor(1);
            } else if (button == btnOpenAlarm) {
                TestManagment.getInstance().openAlarm(2);
            } else if (button == btnCloseAlarm) {
                TestManagment.getInstance().closeDoor(2);
            }
        }
    };

    private void addradio() {
        radios = new ArrayList<>();
        radios.add(raddoor1);
        radios.add(raddoor2);
        radios.add(raddoor3);
        radios.add(raddoor4);
        radios.add(raddoor5);
        radios.add(raddoor6);
        radios.add(raddoor7);
        radios.add(raddoor8);
        radios.add(raddoor9);
        radios.add(raddoor10);
        radios.add(raddoor11);
        radios.add(raddoor12);
        radios.add(raddoor13);
        radios.add(raddoor14);
        radios.add(raddoor15);
        radios.add(raddoor16);
    }

    private void createUIComponents() {
        panel4 = new JPanel();
        raddoor1 = new JRadioButton();
        raddoor2 = new JRadioButton();
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
