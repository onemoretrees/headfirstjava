package com.headfirstjava.first.duckimterfaceimpl;

import com.headfirstjava.first.duckinterface.QuackBehavior;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
