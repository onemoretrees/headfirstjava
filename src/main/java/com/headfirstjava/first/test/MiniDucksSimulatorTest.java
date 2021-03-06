package com.headfirstjava.first.test;

import com.headfirstjava.first.duckimterfaceimpl.FlyRocketPowered;
import com.headfirstjava.first.vo.MallardDuck;
import com.headfirstjava.first.abstractclass.AbstractDuck;
import com.headfirstjava.first.vo.ModelDuck;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public class MiniDucksSimulatorTest {

    public static void main(String[] args) {
        AbstractDuck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        AbstractDuck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
