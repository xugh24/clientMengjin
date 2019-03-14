package com.example.test.demo;

import java.util.List;

public class CommandInfo {

    private final int STX = 0x02;//开始位

    private int Rand = 0xaa;// 随机数可以传任意值

    private int Command;// 指令集

    private int Address;// 控制器地址

    private int door;// 门编号

    private int lengthL;//

    private int lengthH;

    private int cs;

    private final int ETX = 0x03;

    public int getSTX() {
        return STX;
    }

    public int getRand() {
        return Rand;
    }

    public void setRand(int rand) {
        Rand = rand;
    }

    public int getCommand() {
        return Command;
    }

    public void setCommand(int command) {
        Command = command;
    }

    public int getAddress() {
        return Address;
    }

    public void setAddress(int address) {
        Address = address;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getLengthL() {
        return lengthL;
    }

    public void setLengthL(int lengthL) {
        this.lengthL = lengthL;
    }

    public int getLengthH() {
        return lengthH;
    }

    public void setLengthH(int lengthH) {
        this.lengthH = lengthH;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getETX() {
        return ETX;
    }
}
