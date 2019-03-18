package com.mingyu.control;

import com.mingyu.model.CommandInfo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SocketPackage {


    byte[] toBytes() {
        CommandInfo info = new CommandInfo();
        info.initTo56();
        return toBytes(info);
    }


    byte[] toBytes(CommandInfo info) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(info.getSTX());
        byteArrayOutputStream.write(info.getRand());
        byteArrayOutputStream.write(info.getCommand());
        byteArrayOutputStream.write(info.getAddress());
        byteArrayOutputStream.write(info.getDoor());
        byteArrayOutputStream.write(info.getLengthL());
        byteArrayOutputStream.write(info.getLengthH());
        if (info.getDatas().size() > 0) {
            for (byte b : info.getDatas()) {
                byteArrayOutputStream.write(b);
            }
        }
        byteArrayOutputStream.write(info.getCs());
        byteArrayOutputStream.write(info.getETX());
        return byteArrayOutputStream.toByteArray();
    }


    /**
     * TODO:读取输入流转换成一个消息包
     **/
    static SocketPackage parse(InputStream in) throws IOException {
        SocketPackage sp = new SocketPackage();
        byte[] lengthBytes = new byte[4];
        in.read(lengthBytes);// 未收到信息时此步将会阻塞
        // .....其他字段读取就不写了，这里要控制好异常，不要随意catch住，如果发生异常，不是socket坏了就是报文异常了，应当采用拒绝连接的形式向对方跑出异常
        return null;
    }

}
