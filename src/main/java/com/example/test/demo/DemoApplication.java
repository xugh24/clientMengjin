package com.example.test.demo;

import com.example.test.ui.MainWin;
import com.mingyu.control.Management;
import com.mingyu.control.TestManagment;
import com.mingyu.ui.InitialUI;
import javafx.beans.binding.When;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.Socket;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        TestManagment.getInstance().init();// 初始化参数
        InitialUI initialUI = new InitialUI(); // 展示操作界面
    }


}
