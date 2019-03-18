package com.mingyu.config;

import com.mingyu.model.DeviceInfo;

import java.util.ArrayList;
import java.util.List;

public class ReadConfig {

    /**
     * 测试代码 实际代码读取本地配置文件
     */
    public List<DeviceInfo> getDeviceInfos() {
        DeviceInfo info1 = new DeviceInfo();
        info1.setSwitchId("1");
        info1.setSwitchIP("192.168.0.117");
        info1.setSwitchName("可用测试门1");

        DeviceInfo info2 = new DeviceInfo();
        info2.setSwitchId("2");
        info2.setSwitchIP("192.168.0.118");
        info2.setSwitchName("不用测试门A");

        DeviceInfo info3 = new DeviceInfo();
        info3.setSwitchId("3");
        info3.setSwitchIP("192.168.0.119");
        info3.setSwitchName("不可用测试门B");
        DeviceInfo info4 = new DeviceInfo();
        info4.setSwitchId("4");
        info4.setSwitchIP("192.168.0.11");
        info4.setSwitchName("可用测试门C");
        List<DeviceInfo> list = new ArrayList<>();
        list.add(info1);
        list.add(info2);
        list.add(info3);
        list.add(info4);
        return list;
    }


    /**
     *
     */
    public int getDecviceType() {
        return 0x01;
    }
}
