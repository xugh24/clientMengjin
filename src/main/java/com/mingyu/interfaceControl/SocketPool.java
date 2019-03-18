package com.mingyu.interfaceControl;

import com.mingyu.net.BaseSocket;

/**
 * 定义一个连接池接口SocketPool
 **/
public interface SocketPool {
    BaseSocket get();

    /**
     * 回收Socket
     **/
    void recycle(BaseSocket ns);

    /**
     * 销毁Socket
     **/
    void destroy(BaseSocket ns);
}
