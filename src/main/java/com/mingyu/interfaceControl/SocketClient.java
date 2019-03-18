package com.mingyu.interfaceControl;

import com.mingyu.control.SocketPackage;
import com.mingyu.net.BaseSocket;

public interface SocketClient {

    SocketPackage sendData(SocketPackage sp);// 发送一个消息包，并等待返回的消息包
    // TODO:还可以根据双方的业务和协议添加几个更方便使用的接口方法。比如只返回消息体字段，或者直接返回json内容的

    void sendHeartBeat(BaseSocket socket);// 发送一个心跳包，这个方法后面讲心跳包时会用到
}
