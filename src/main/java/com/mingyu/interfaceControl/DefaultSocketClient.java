package com.mingyu.interfaceControl;

import com.mingyu.analysis.FristResponseAnalysis;
import com.mingyu.control.Management;
import com.mingyu.control.SocketPackage;
import com.mingyu.control.TestManagment;
import com.mingyu.model.DeviceInfo;
import com.mingyu.net.BaseSocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.SocketHandler;

import static java.nio.charset.Charset.cache;

public class DefaultSocketClient implements SocketClient {

    private List<BaseSocket> baseSockets = new ArrayList<>();

    public DefaultSocketClient() throws IOException {
        if (TestManagment.getInstance().checkDeviceInfos()) {
            for (DeviceInfo info : TestManagment.getInstance().getDeviceInfos()) {
                BaseSocket socket = new BaseSocket(info.getSwitchIP());
                baseSockets.add(socket);
            }
        }

        heartMonitor();
    }

    private void heartMonitor() {
        for (BaseSocket socket : baseSockets) {


        }
    }


    @Override
    public SocketPackage sendData(SocketPackage sp) {
        return null;
    }

    @Override
    public void sendHeartBeat(BaseSocket socket) {

    }

    /**
     * 创建一个工作者线程类，处理连入的socket
     **/
    class Worker extends Thread {
        //针对每种行为标识做的消息处理器。
        BaseSocket socket;
        Worker(BaseSocket socket) {//构造函数
            this.socket = socket;
        }

        @Override
        public void run() {

            while (true){
                try {

                    socket.getInputStream();



                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
