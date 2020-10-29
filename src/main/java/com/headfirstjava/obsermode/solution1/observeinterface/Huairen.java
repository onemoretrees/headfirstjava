package com.headfirstjava.obsermode.solution1.observeinterface;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public interface Huairen {
    /**
     * 增加通知者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 减少通知者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     * 通知 通知者
     * @param message
     */
    void notice(String message);
}
