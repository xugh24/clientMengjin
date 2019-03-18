package com.mingyu.control;

import com.mingyu.model.DeviceInfo;
import com.mingyu.net.BaseSocket;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketControl {

    private List<BaseSocket> sockets;

    public SocketControl() {
        sockets = new ArrayList<>();
        if (TestManagment.getInstance().checkDeviceInfos()) {
            for (DeviceInfo info : TestManagment.getInstance().getDeviceInfos()) {
                try {
                    BaseSocket socket = new BaseSocket(info.getSwitchIP());
                    sockets.add(socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
