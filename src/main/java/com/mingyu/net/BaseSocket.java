package com.mingyu.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class BaseSocket extends Socket {

    private String ip; // 目前设备的Ip

    private int port;// 端口号

    private volatile long lastUse;// 上次使用时间

    public BaseSocket(String ip, int port) throws IOException {
        super(ip, port);
        this.ip = ip;
        this.port = port;
        this.lastUse = System.currentTimeMillis();
    }

    public BaseSocket(String ip) throws IOException {
        new BaseSocket(ip, 8000);
    }

    public String getIp() {
        return ip;
    }

    /**
     * 获得输入流
     */
    public InputStream getIn() throws IOException {
        return getInputStream();
    }

    public void write(byte[] bytes) throws IOException {
        getOutputStream().write(bytes);
    }
}
