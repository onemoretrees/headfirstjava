package com.headfirstjava.first.abstractclass;

import com.headfirstjava.first.duckinterface.FlyBehavior;
import com.headfirstjava.first.duckinterface.QuackBehavior;

/**
 * @author: liuyuhang
 * @date: 2020/10/18
 */
public abstract class Duck {
    /**
     * 为行为接口类型声明两个引用变量，
     * 所有鸭子子类都继承他们
     */

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public Duck(){

    };

    public abstract void display();



    public void performFly(){
        /**
         * 委托给行为类来执行
         */
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }



    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
