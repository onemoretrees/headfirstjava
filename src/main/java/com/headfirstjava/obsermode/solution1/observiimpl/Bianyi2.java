package com.headfirstjava.obsermode.solution1.observiimpl;

import com.headfirstjava.obsermode.solution1.observeinterface.Observer;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public class Bianyi2 implements Observer {

    private String bname = "石破天";

    @Override
    public void update(String message, String name) {
        System.out.println(bname+":"+name+"那里有新情况："+ message);
    }
}
