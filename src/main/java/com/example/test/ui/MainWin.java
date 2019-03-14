package com.example.test.ui;

import com.example.test.demo.SocketControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.TimerTask;


public class MainWin extends JFrame {
    private SocketControl socketControl;

    private JDesktopPane desktop = null;//定义桌面面板

    private MouseOption mouseOption = new MouseOption();//鼠标监听对象

    private MyButton openDoor0;// 开门0

    private MyButton closeDoor0;// 关门0

    private MyButton openDoor1;// 开门1

    private MyButton closeDoor1;// 关门1

    private MyButton openPol;// 打开报警

    private MyButton closepol;// 关闭报警

    private MyButton openfirePol;//打开火警

    private MyButton closefirePol; // 关闭火警


    public MainWin(String title) {
        super(title);
        socketControl = new SocketControl();
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //得到系统屏幕的大小
        Dimension dimension = toolkit.getScreenSize(); //设置布局管理为BorderLayout
        this.setLayout(new BorderLayout());
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight() - 100;
        this.setSize(width, height);
        desktop = new JDesktopPane();
        //创建一个空的的图片
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        BufferedImage ad = null;
        //将背景图按比例缩放重新画到之前创建的空图片
        g.drawImage(ad, 0, 0, width, height, null);
        //转化为Icon类图片
        ImageIcon img = new ImageIcon(image);
        //设置存放背景图的背景标签的位置和大小
        //创建按钮
        openDoor0 = new MyButton("开门0", mouseOption);
        openDoor0.setBounds(20, 88, 148, 48);
        closeDoor0 = new MyButton("关门0", mouseOption);
        closeDoor0.setBounds(20, 156, 148, 48);
        openDoor1 = new MyButton("开门1", mouseOption);
        openDoor1.setBounds(20, 224, 148, 48);
        closeDoor1 = new MyButton("关门1", mouseOption);
        closeDoor1.setBounds(20, 292, 148, 48);
        openPol = new MyButton("打开报警", mouseOption);
        openPol.setBounds(20, 360, 148, 48);
        closepol = new MyButton("关闭报警", mouseOption);
        closepol.setBounds(20, 428, 148, 48);
        openfirePol = new MyButton("打开火警", mouseOption);
        openfirePol.setBounds(20, 496, 148, 48);
        closefirePol = new MyButton("关闭火警", mouseOption);
        closefirePol.setBounds(20, 564, 148, 48);

        desktop.add(openDoor0, Integer.MIN_VALUE + 1);
        desktop.add(closeDoor0, Integer.MIN_VALUE + 1);
        desktop.add(openDoor1, Integer.MIN_VALUE + 1);
        desktop.add(closeDoor1, Integer.MIN_VALUE + 1);

        desktop.add(openPol, Integer.MIN_VALUE + 1);
        desktop.add(closepol, Integer.MIN_VALUE + 1);
        desktop.add(openfirePol, Integer.MIN_VALUE + 1);
        desktop.add(closefirePol, Integer.MIN_VALUE + 1);

        this.getContentPane().add(desktop, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


    public class MouseOption extends MouseAdapter {
        private int count;
        private String str = null;

        /**
         * 添加鼠标点击事件
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            button.setContentAreaFilled(true);
            str = button.getText();
            System.out.println(str);
            if("打开报警".equals(str)){
                socketControl.open0x18(0x00);
            }
            if("关闭火警".equals(str)){
                socketControl.open0x18(0x01);
            }
        }


    }


}
