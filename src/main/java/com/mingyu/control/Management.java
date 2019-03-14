package com.mingyu.control;

import com.mingyu.ui.OpenDoorGui;

public class Management {

    public static Management managMent;

    private OpenDoorGui openDoorGui;

    public static Management getInstance() {
        if (managMent == null) {
            managMent = new Management();
        }
        return managMent;
    }

    public void showControlOpen() {
        if (openDoorGui == null) {
            openDoorGui = new OpenDoorGui();
        }
        openDoorGui.show();
    }
}
