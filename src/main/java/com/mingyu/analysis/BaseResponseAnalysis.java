package com.mingyu.analysis;


import java.io.InputStream;
import java.util.Arrays;

/**
 * 解析响应的基类
 * <p>
 * 用于解析设备相应，根据不同的板子，指令码的不同实现该类
 */
public abstract class BaseResponseAnalysis {

    private int dataLength; // 响应数据长度

    private byte[] headerData;// 包头数据

    private byte[] data;// 相应参数

    private byte command;// 指令


    /**
     * @return 处理数据成功返回true
     */
    public abstract boolean analysisResponse(InputStream in);

    /**
     * @deprecated 获得包头长度
     */
    public abstract int getheaderLength();

    /**
     * 获得包尾长度
     */
    public abstract int getEndLength();


    /**
     * @return 获得开始位的长度
     */
    public abstract int getSTXLength();


    /**
     * @return 返回响应长度
     */
    public abstract int getResponseLength();

    public abstract boolean verifyHeader(int[] header);

    /**
     * 判断开始位是否一致
     */
    public boolean verifySTX(int... ints) {
        return Arrays.equals(ints, getETX());
    }
    /**
     * 判断开始位是否一致
     */
    public abstract boolean verifyCommand();


    public abstract int[] getETX();

    public abstract int[] getSTX();


    public int getDataLength() {
        return dataLength;
    }

    public void setDataLength(int dataLength) {
        this.dataLength = dataLength;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public byte[] getHeaderData() {
        return headerData;
    }

    public void setHeaderData(byte[] headerData) {
        this.headerData = headerData;
    }

    public byte getCommand() {
        return command;
    }

    public void setCommand(byte command) {
        this.command = command;
    }
}
