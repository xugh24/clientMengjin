package com.mingyu.model;

/**
 * 开关类
 */
public class DeviceInfo {

    private String deviceName;// 设备名称

    private String deviceId; //  设备id

    private String deviceIp; // 设备ip

    public String getSwitchName() {
        return deviceName;
    }

    public void setSwitchName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSwitchId() {
        return deviceId;
    }

    public void setSwitchId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSwitchIP() {
        return deviceIp;
    }

    public void setSwitchIP(String deviceIp) {
        this.deviceIp = deviceIp;
    }
}
