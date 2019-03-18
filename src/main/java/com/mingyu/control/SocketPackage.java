package com.mingyu.control;

import com.mingyu.analysis.FristResponseAnalysis;
import com.mingyu.model.CommandInfo;
import com.mingyu.model.ResponseInfo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SocketPackage {


    public static byte[] toBytes56() {
        CommandInfo info = new CommandInfo();
        info.initTo56();
        return toBytes(info);
    }


    private static byte[] toBytes(CommandInfo info) {
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
    public static ResponseInfo parse(InputStream in) throws IOException {
        ResponseInfo info = new ResponseInfo();
        FristResponseAnalysis analysis = new FristResponseAnalysis(info);
        analysis.analysisResponse(in);
        return info;
    }

}
