package com.mingyu.analysis;

import com.mingyu.enumControl.FirstEnum;
import com.mingyu.interfaceControl.ResponseCallBack;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FristResponseAnalysis extends BaseResponseAnalysis {

    private ResponseCallBack responseCallBack;

    private int door;

    /**
     * 解析输入流
     */
    @Override
    public boolean analysisResponse(InputStream in) {
        byte[] b = new byte[getheaderLength()];// 创建一个和包头长度一致的数组
        try {
            in.read(b);// 读出包头
            if (verifyHeader(b)) {
                byte[] bdata = new byte[getDataLength()];
                in.read(bdata);// 读取数据
                setData(bdata);
                byte cs = getCsByData();
                if (cs == -1) {
                    return false;
                }
                byte[] csbyte = new byte[1];
                in.read(csbyte);// 读取校验位
                if (cs != csbyte[1]) {
                    System.out.print("校验位出错，数据被干扰无法使用");
                    return false;
                }
                return operateData();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 处理数据类
     */
    private boolean operateData() {
        if (getData() == null && responseCallBack != null) {
            responseCallBack.callBack(getCommand(), getData());
            return true;
        }
        return false;
    }

    /**
     * 根据数据计算校验位
     */
    private byte getCsByData() {
        byte cs = -1;
        byte[] b1 = getHeaderData();
        byte[] b2 = getData();
        if (b1 == null || b2 == null) {
            return cs;
        }
        int b1Length = b1.length;
        int b2length = b2.length;
        byte[] b3 = new byte[b1Length + b2length];
        for (int x = 0; x < b1Length; x++) {
            b3[x] = b1[x];
        }
        for (int y = 0; y < b2length; y++) {
            b3[b1Length + y] = b2[y];
        }
        cs = 0x00;
        for (byte bdata : b3) {
            cs = (byte) (cs ^ bdata);
        }
        return cs;
    }

    /**
     * 校验包头数据
     */
    public boolean verifyHeader(byte[] b) {
        if (b != null) {
            if (b.length != getheaderLength()) {
                System.out.print("包头长度和定义的不一致");
                System.out.print("  实际包头长度 ：" + b.length);
                System.out.print("  标准长度：" + getheaderLength());
                return false;
            } else {
                if (verifySTX(b[0])) {
                    setHeaderData(b);// 设置头部数据
                    door = b[4];
                    setDataLength(b[6]);// 设置数据长度
                    setCommand(b[2]);
                    return verifyCommand();
                } else {
                    System.out.print("开始位数据出错" + b[0]);
                    return false;
                }
            }
        } else {
            System.out.print("包头数据为空");
            return false;
        }
    }

    @Override
    public int getheaderLength() {
        return 0x07;
    }

    @Override
    public int getEndLength() {
        return 0x02;
    }


    @Override
    public int getSTXLength() {
        return 0x01;
    }

    @Override
    public int getResponseLength() {
        return 0;
    }

    @Override
    public boolean verifyHeader(int[] header) {
        return false;
    }

    @Override
    public boolean verifyCommand() {
        for (FirstEnum e : FirstEnum.values()) {
            if (e.command == getCommand()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int[] getETX() {
        int[] ints = {0x03};
        return ints;
    }

    @Override
    public int[] getSTX() {
        int[] ints = {0x02};
        return ints;
    }


    public ResponseCallBack getResponseCallBack() {
        return responseCallBack;
    }

    public void setResponseCallBack(ResponseCallBack responseCallBack) {
        this.responseCallBack = responseCallBack;
    }
}
