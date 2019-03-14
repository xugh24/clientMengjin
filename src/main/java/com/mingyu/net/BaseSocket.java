package com.mingyu.net;

import java.io.IOException;
import java.net.Socket;

public class BaseSocket extends Socket {

    private String ip; // 目前设备的Ip

    private int port;// 端口号

    public BaseSocket(String ip, int port) throws IOException {
        super(ip, port);
        this.ip = ip;
        this.port = port;
    }

    private String getIp() {
        return ip;
    }
}
