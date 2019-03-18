package com.mingyu.model;

import java.util.ArrayList;
import java.util.List;

public class CommandInfo {

    private final byte STX = 0x02;//开始位

    private byte Rand = 0x01;// 随机数可以传任意值

    private byte Command;// 指令集

    private byte Address;// 控制器地址

    private byte door;// 门编号

    private byte lengthL;//

    private byte lengthH;

    private List<Byte> datas; // 数据

    private byte cs;

    private final byte ETX = 0x03;

    public void initTo56() {
        setCommand((byte) 0x56);
        setAddress((byte) 0x00);// 设置地址
        setDoor((byte) 0x01); // 设置门地址
        setLengthL((byte) 0x02);
        setLengthH((byte) 0x00);
        List<Byte> datas = new ArrayList<>();
        datas.add((byte) 0x00);
        datas.add((byte) 0x00);
        getCsByInfo();
    }

    private void getCsByInfo() {
        cs = (byte) (getSTX() ^ getRand() ^ getCommand() ^ getAddress() ^ getDoor() ^ getLengthL() ^ getLengthH());
        if (getDatas().size() > 0) {
            for (byte b : getDatas()) {
                cs = (byte) (cs ^ b);
            }
        }
    }

    public byte getCommand() {
        return Command;
    }

    public void setCommand(byte command) {
        Command = command;
    }

    public byte getAddress() {
        return Address;
    }

    public void setAddress(byte address) {
        Address = address;
    }

    public byte getDoor() {
        return door;
    }

    public void setDoor(byte door) {
        this.door = door;
    }

    public byte getLengthL() {
        return lengthL;
    }

    public void setLengthL(byte lengthL) {
        this.lengthL = lengthL;
    }

    public byte getLengthH() {
        return lengthH;
    }

    public void setLengthH(byte lengthH) {
        this.lengthH = lengthH;
    }

    public List<Byte> getDatas() {
        return datas;
    }

    public void setDatas(List<Byte> datas) {
        this.datas = datas;
    }

    public byte getCs() {
        return cs;
    }

    public void setCs(byte cs) {
        this.cs = cs;
    }

    public byte getSTX() {
        return STX;
    }

    public byte getRand() {
        return Rand;
    }

    public void setRand(byte rand) {
        Rand = rand;
    }

    public byte getETX() {
        return ETX;
    }
}
