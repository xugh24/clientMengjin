package com.mingyu.enumControl;

public enum FirstEnum {

    SETTING_CONTROL(0x63),// 设置控制器参数
    OPEN_DOOR(0x2c),// 开门
    CLOSE_DOOR(0x2d),// 关门
    SETTING_TIME(0x07),// 时间同步
    SETING_DOOR(0x61),//设置门参数
    CLEAR_DOOR_OPENTIME(0x0f),//清除门的全部开放时间
    ADD_DOOR_OPENTIME(0x04),//增加一个门的开放时间
    RESTORATION_CONTROL(0x63),//控制器复位
    RESTART_CONTROL(0x05),//重启控制器
    POLICE(0x18),//操作报警（开关报警输出）
    FIRE_ALARM(0x19),//操作火警（开关火警输出）
    UP_CARD(0x53),//上传刷卡记录
    UP_QRCODE(0x55),//上传二维码记录
    UP_IDENTITY_ID(0x58),//上传身份证记录
    UP_IDENTITY_PIC(0x59),//上传身份证照片
    UP_POL_RECORD(0x54),//上传报警记录
    UP_STATE(0x56),//上传状态（心跳指令）
    ALTER_IP(0x08),//修改ip
    SEND_485(0xb1),//发送485指令
    LCD_MULTILINE(0xb3),//LCD 显示多行文本(卡号为字符串格式)
    LCD_SINGLELINE(0xb4),//LCD 显示多行文本
    LCD_MULTILINE_ST(0xb5),//LCD 显示多行文本(卡号为默认文本)
    LCD_MULTILINE_INT(0xb6);//LCD 卡号为整数格式

    public int command;

    FirstEnum(int command) {
        this.command = command;
    }
}
