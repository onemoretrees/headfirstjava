package com.headfirstjava.obsermode.solution1.test;

import com.headfirstjava.obsermode.solution1.observeinterface.Huairen;
import com.headfirstjava.obsermode.solution1.observeinterface.Observer;
import com.headfirstjava.obsermode.solution1.observiimpl.*;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public class Clienter {

    /**
     * https://www.cnblogs.com/V1haoge/p/6513651.html
     * 参考链接
     * @param args
     */
    public static void main(String[] args) {
        //定义两个嫌犯
        Huairen xf1 = new XianFan1();
        Huairen xf2 = new XianFan2();

        //定义三个观察便衣警察
        Observer o1 = new Bianyi1();
        Observer o2 = new Bianyi2();
        Observer o3 = new Bianyi3();


        //为嫌犯增加观察便衣
        xf1.addObserver(o1);
        xf1.addObserver(o2);
        xf2.addObserver(o1);
        xf2.addObserver(o3);


        //定义嫌犯的情况
        String message1 = "又卖了一批货";
        String message2 = "老大要下来视察了";
        //嫌犯通知
        xf1.notice(message1);
        xf2.notice(message2);
    }

}
