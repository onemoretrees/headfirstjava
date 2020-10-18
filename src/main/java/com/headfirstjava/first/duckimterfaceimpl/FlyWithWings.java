package com.headfirstjava.first.duckimterfaceimpl;

import com.headfirstjava.first.duckinterface.FlyBehavior;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
