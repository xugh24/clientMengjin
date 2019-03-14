package com.example.test.demo;

public class DataUtil {

    public final static int SETTING_CONTROL = 0x63;// 设置控制器参数

    public final static int OPEN_DOOR = 0x2c;// 开门

    public final static int CLOSE_DOOR = 0x2d;// 关门

    public final static int SETTING_TIME = 0x07;// 时间同步

    public final static int SETING_DOOR = 0x61;//设置门参数

    public final static int CLEAR_DOOR_OPENTIME = 0x0f;//清除门的全部开放时间

    public final static int ADD_DOOR_OPENTIME = 0x0d;//增加一个门的开放时间

    public final static int RESTORATION_CONTROL = 0x04;//控制器复位

    public final static int RESTART_CONTROL  = 0x05;//重启控制器

    public final static int POLICE = 0x18;//操作报警（开关报警输出）

    public final static int FIRE_ALARM = 0x19;//操作火警（开关火警输出）

    public final static int UP_CARD = 0x53;// 上传刷卡记录

    public final static int UP_QRCODE = 0x55;//上传二维码记录

    public final static int UP_IDENTITY_ID = 0x58;//上传身份证记录

    public final static int UP_IDENTITY_PIC = 0x59;//上传身份证照片

    public final static int UP_POL_RECORD = 0x54;//上传报警记录

    public final static int UP_STATE = 0x56;//上传状态（心跳指令）

    public final static int ALTER_IP = 0x08; // 修改ip

    public final static int SEND_485 = 0xb1;//发送485指令

    public final static int LCD_MULTILINE = 0xb3;//LCD 显示多行文本(卡号为字符串格式)

    public final static int LCD_SINGLELINE = 0xb4;//LCD 显示多行文本

    public final static int LCD_MULTILINE_ST = 0xb5;//LCD 显示多行文本(卡号为默认文本)

    public final static int LCD_MULTILINE_INT = 0xb6;//LCD 卡号为整数格式

}
