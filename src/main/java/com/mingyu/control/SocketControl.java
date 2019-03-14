package com.mingyu.control;

import com.mingyu.net.BaseSocket;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketControl {

    private List<BaseSocket> sockets;

    public SocketControl() {
        sockets = new ArrayList<>();
    }


}
