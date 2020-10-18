package com.headfirstjava.first.vo;

import com.headfirstjava.first.abstractclass.Duck;
import com.headfirstjava.first.duckimterfaceimpl.FlyNoWay;
import com.headfirstjava.first.duckimterfaceimpl.Quack;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
