package com.mingyu.control;

import com.mingyu.model.DeviceInfo;

import java.util.ArrayList;
import java.util.List;

public class DeviceInfoControl {

    private List<DeviceInfo> deviceInfos;

    private final int maxDeviceNum = 12;

    public DeviceInfoControl() {
        deviceInfos = new ArrayList<>();
    }


    /**
     * @return 增加设备 增加成功返回true
     */
    public boolean addDeviceInfo(DeviceInfo info) {
        if (!checkIp(info)) {
            if (deviceInfos.size() < maxDeviceNum) {
                deviceInfos.add(info);
                return true;
            } else {
                System.out.print("设备数量超过最大阀值");
                return false;
            }
        }
        return false;
    }

    /**
     * @return 删除设备 删除成功返回true
     */
    public boolean delDeviceInfoByIp(String ip) {
        if (deviceInfos.size() > 0) {
            for (DeviceInfo temp : deviceInfos) {
                if (temp.getSwitchIP() != null && temp.getSwitchId().equals(ip)) {
                    deviceInfos.remove(temp);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @return 如果没有对应名称的设备则返回null
     * 调用该方法需要注意非空方法
     */
    public String getIpByName(String name) {
        if (getDeviceInfoByName(name) != null) {
            return getDeviceInfoByName(name).getSwitchIP();
        }
        return null;
    }

    /**
     * @return DeviceInfo
     * <p>
     * 根据名称返回 info
     */
    public DeviceInfo getDeviceInfoByName(String name) {
        if (name != null) {
            if (deviceInfos.size() > 0) {
                for (DeviceInfo temp : deviceInfos) {
                    if (temp.getSwitchName() != null && temp.getSwitchName().equals(name)) {
                        return temp;
                    }
                }
            }
        }
        return null;
    }


    /**
     * @return DeviceInfo
     */
    public DeviceInfo getDeviceInfoByIp(String ip) {
        if (deviceInfos.size() > 0) {
            for (DeviceInfo temp : deviceInfos) {
                if (temp.getSwitchIP() != null && temp.getSwitchId().equals(ip)) {
                    return temp;
                }
            }
        }
        return null;
    }


    /**
     * @return 检查是否有相同IP，有返回true，没有返回false
     */
    private boolean checkIp(DeviceInfo info) {
        if (deviceInfos.size() == 0) {
            return true;
        }
        for (DeviceInfo temp : deviceInfos) {
            if (info.getSwitchIP() != null && info.getSwitchId().equals(temp.getSwitchId())) {
                System.out.print("IP 已经被占用 占用设备名称：" + temp.getSwitchName());
                return false;
            }
        }
        return true;
    }
}
