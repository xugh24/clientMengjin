package com.example.test.ui;

import javax.swing.*;

public class MyButton extends JButton {

    public MyButton(String name, MainWin.MouseOption mouseOption) {
//        setIcon(new ImageIcon(this.getClass().getResource("/lib/notebook.png")));
        super(name);
        setContentAreaFilled(false);
        setBorderPainted(false);
        addMouseListener(mouseOption);
    }

    public void setBounds(int x,int y,int w,int h) {
        super.setBounds(x, y, w, h);
    }

}
