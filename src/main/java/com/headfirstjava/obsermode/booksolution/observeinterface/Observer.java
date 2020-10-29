package com.headfirstjava.obsermode.booksolution.observeinterface;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public interface Observer {
    /**
     * 更新方法
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    public void update(float temp,float humidity,float pressure);
}
