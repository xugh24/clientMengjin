package com.mingyu.model;

import java.util.List;

public class ResponseInfo {
    private byte Command;// 指令集
    private byte door;// 门编号
    private List<Byte> datas; // 数据

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

    public List<Byte> getDatas() {
        return datas;
    }

    public void setDatas(List<Byte> datas) {
        this.datas = datas;
    }
}
