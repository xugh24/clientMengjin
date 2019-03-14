package com.mingyu.model;

public class CommandInfo {

    private final byte STX = 0x02;//开始位

    private byte Rand = 0x01;// 随机数可以传任意值

    private byte Command;// 指令集

    private byte Address;// 控制器地址

    private byte door;// 门编号

    private byte lengthL;//

    private byte lengthH;

    private byte cs;

    private final byte ETX = 0x03;
}
