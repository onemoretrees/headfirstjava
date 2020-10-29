package com.headfirstjava.obsermode.solution1.observeinterface;


/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public interface Observer {
    /**
     * 通知方法，通知 通知者
     * @param message
     * @param name
     */
    void update(String message,String name);
}
