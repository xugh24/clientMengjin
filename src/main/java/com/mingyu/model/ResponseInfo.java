package com.mingyu.model;

import com.mingyu.interfaceControl.ResponseCallBack;

import java.util.List;

public class ResponseInfo implements ResponseCallBack {
    private byte Command;// 指令集
    private byte door;// 门编号
    private byte[] datas; // 数据

    public byte getCommand() {
        return Command;
    }

    public void setCommand(byte command) {
        Command = command;
    }

    public byte getDoor() {
        return door;
    }

    public void setDoor(byte door) {
        this.door = door;
    }

    public byte[] getDatas() {
        return datas;
    }

    public void setDatas(byte[] data) {
        this.datas = datas;
    }

    @Override
    public void callBack(byte command, byte[] data) {
        setCommand(command);
        setDatas(datas);
    }

    @Override
    public void callBackOther(int type, byte data) {
        setDoor(data);
    }
}
