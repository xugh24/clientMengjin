package com.mingyu.interfaceControl;

public interface ResponseCallBack {

    public abstract void callBack(byte command, byte data[]);

    public abstract void callBackOther(int type, byte data);


}
