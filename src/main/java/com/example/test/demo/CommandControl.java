package com.example.test.demo;

import java.io.ByteArrayOutputStream;

public class CommandControl {


    private CommandInfo info;

    public CommandControl() {
        info = new CommandInfo();
    }


    /**
     * 获得指令集
     */
    public byte[] getInstructSt(int command, int door,int state) {
        switch (command) {
            case DataUtil.UP_STATE:
                return get0x56(command);
            case DataUtil.POLICE:
                return get0x18(command,state);
        }
        return null;
    }

    private byte[] get0x56(int command) {
        CommandInfo info = new CommandInfo();
        info.setCommand(command);// 设置指令
        info.setAddress(0x00);// 设置地址
        info.setDoor(0x01); // 设置门地址
        info.setLengthL(0x02);
        info.setLengthH(0x00);
        int data1 = 0x00;
        int data2 = 0x00;
        int sc = info.getSTX() ^ info.getRand() ^ info.getCommand() ^ info.getAddress() ^ info.getDoor() ^ info.getLengthL() ^ info.getLengthH() ^ data1 ^ data2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(info.getSTX());
        byteArrayOutputStream.write(info.getRand());
        byteArrayOutputStream.write( info.getCommand() );
        byteArrayOutputStream.write(info.getAddress());
        byteArrayOutputStream.write( info.getDoor());
        byteArrayOutputStream.write( info.getLengthL() );
        byteArrayOutputStream.write(info.getLengthH());
        byteArrayOutputStream.write(data1);
        byteArrayOutputStream.write(data2);
        byteArrayOutputStream.write(sc);
        byteArrayOutputStream.write(info.getETX());
        return byteArrayOutputStream.toByteArray();
    }


    private byte[] get0x18(int command,int state) {
        CommandInfo info = new CommandInfo();
        info.setCommand(command);// 设置指令
        info.setAddress(0x00);// 设置地址
        info.setDoor(0x01); // 设置门地址
        info.setLengthL(0x02);
        info.setLengthH(0x00);
        int data1 = state;
        int data2 = 0x01;
        int sc = info.getSTX() ^ info.getRand() ^ info.getCommand() ^ info.getAddress() ^ info.getDoor() ^ info.getLengthL() ^ info.getLengthH() ^ data1 ^ data2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(info.getSTX());
        byteArrayOutputStream.write(info.getRand());
        byteArrayOutputStream.write( info.getCommand() );
        byteArrayOutputStream.write(info.getAddress());
        byteArrayOutputStream.write( info.getDoor());
        byteArrayOutputStream.write( info.getLengthL() );
        byteArrayOutputStream.write(info.getLengthH());
        byteArrayOutputStream.write(data1);
        byteArrayOutputStream.write(data2);
        byteArrayOutputStream.write(sc);
        byteArrayOutputStream.write(info.getETX());
        return byteArrayOutputStream.toByteArray();
    }


}
