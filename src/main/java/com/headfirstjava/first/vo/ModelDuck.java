package com.headfirstjava.first.vo;

import com.headfirstjava.first.abstractclass.AbstractDuck;
import com.headfirstjava.first.duckimterfaceimpl.FlyNoWay;
import com.headfirstjava.first.duckimterfaceimpl.Quack;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class ModelDuck extends AbstractDuck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
