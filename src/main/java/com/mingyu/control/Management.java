package com.mingyu.control;

import com.mingyu.model.DeviceInfo;
import com.mingyu.ui.OpenDoorGui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.List;

public abstract class Management {

    public static Management managMent;

    private OpenDoorGui openDoorGui;

    private List<DeviceInfo> deviceInfos;// 门集合

    private JRadioButton tempRadioButton; // 被选中的门

    private int deviceType; // 设备种类，根据后续种类差别 可以扩展


    public void showControlOpen() {
        if (openDoorGui == null) {
            openDoorGui = new OpenDoorGui();
        }
        openDoorGui.show();
    }

    /**
     * 初始化方法
     */
    public abstract void init();

    /**
     * @param door 门编号
     */
    public abstract void openDoor(int door);

    /**
     * @param door 门编号
     */
    public abstract void closeDoor(int door);


    /**
     * @param type 报警类型
     */
    public abstract void openAlarm(int type);


    /**
     * @param type 报警类型
     */
    public abstract void closeAlarm(int type);

    public List<DeviceInfo> getDeviceInfos() {
        return deviceInfos;
    }

    public void setDeviceInfos(List<DeviceInfo> deviceInfos) {
        this.deviceInfos = deviceInfos;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 绑定门单选框
     */
    public void bindRadio(List<JRadioButton> radios) {
        if (deviceInfos == null || deviceInfos.size() == 0) {
            System.out.print("门数据为空");
            System.exit(1);
        }
        if (deviceInfos.size() > 16) {
            System.out.print("配置门个数操作阀值，重新配置");
            System.exit(1);
        }

        for (JRadioButton radioButton : radios) {
            radioButton.setText("未设置不可用");
            radioButton.setEnabled(false);// 设置按钮不可以用
        }
        ButtonGroup groups = new ButtonGroup();
        for (int i = 0; i < deviceInfos.size(); i++) {
            radios.get(i).setText(deviceInfos.get(i).getSwitchName());
            radios.get(i).setEnabled(true);
            groups.add(radios.get(i));
        }

    }

    public JRadioButton getTempRadioButton() {
        return tempRadioButton;
    }

    public void setTempRadioButton(JRadioButton tempRadioButton) {
        this.tempRadioButton = tempRadioButton;
    }

    public boolean checkDeviceInfos() {
        if (deviceInfos != null && deviceInfos.size() > 0) {
            return true;
        }
        System.exit(1);
        System.out.println("门参数为空");
        return false;
    }
}
