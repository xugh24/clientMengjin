package com.example.test.demo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketControl {
    private Socket sck;

    private CommandControl commandControl;

    public SocketControl() {
        commandControl = new CommandControl();
        String ip = "192.168.0.117";   //服务器端ip地址
        int port = 8000;        //端口号
        try {
            sck = new Socket(ip, port);
            heartbeat();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void heartbeat() {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            InputStream is = sck.getInputStream();
                             String result = inputStream2String(is);
                            OutputStream os = sck.getOutputStream();   //输出流
                            os.write(commandControl.getInstructSt(0x56, 0x00, 0x00));
                            os.flush();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void open0x18(int state) {
        try {
            OutputStream os = sck.getOutputStream();
            os.write(commandControl.getInstructSt(0x18, 0x00, state));
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private String inputStream2String(InputStream in) throws IOException {
        byte[] b = new byte[7];
        in.read(b);
        int n = b[6];
        System.out.println(n);
        for (int i = 0; i < n + 2; i++) {
            int n2 = in.read();
            System.out.println(n2);
        }
        return "";
    }


}
