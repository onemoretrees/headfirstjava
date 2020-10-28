package com.headfirstjava.first.vo;

import com.headfirstjava.first.abstractclass.AbstractDuck;
import com.headfirstjava.first.duckimterfaceimpl.FlyWithWings;
import com.headfirstjava.first.duckimterfaceimpl.Quack;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
