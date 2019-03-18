package com.mingyu.control;

import com.mingyu.config.ReadConfig;

public class TestManagment extends Management {

    private static TestManagment testManagment;

    public static TestManagment getInstance() {
        if (testManagment == null) {
            testManagment = new TestManagment();
        }
        return testManagment;
    }


    @Override
    public void init() {
        // 获取门参数 和 设备参数
        ReadConfig readConfig = new ReadConfig();// 读取参数
        setDeviceInfos(readConfig.getDeviceInfos());
        setDeviceType(readConfig.getDecviceType());

    }

    @Override
    public void openDoor(int door) {

    }

    @Override
    public void closeDoor(int door) {

    }

    @Override
    public void openAlarm(int type) {

    }

    @Override
    public void closeAlarm(int type) {

    }


}
