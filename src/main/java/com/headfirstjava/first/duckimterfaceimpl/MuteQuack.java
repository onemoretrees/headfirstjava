package com.headfirstjava.first.duckimterfaceimpl;

import com.headfirstjava.first.duckinterface.QuackBehavior;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<Silence>");
    }
}
