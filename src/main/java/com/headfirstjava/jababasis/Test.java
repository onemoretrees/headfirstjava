package com.headfirstjava.jababasis;


/**
 * @author: liuyuhang
 * @date: 2020/11/04
 */
public class Test {


    /**
     * nullPointerException
     * 一般会去使用一个一定不为空的字符串来
     * 比较另外一个传递过来的字符串来避免
     * 空指针异常
     */

    @org.junit.Test
    public void nullPointerTest(){
        String a = null;
        String b = "1";

        b.equals(a);
    }
}
