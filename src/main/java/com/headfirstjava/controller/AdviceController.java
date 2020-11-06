package com.headfirstjava.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liuyuhang
 * @date: 2020/11/06
 */
@RestController
@RequestMapping(value = "/adviceDemo")
public class AdviceController {



    @RequestMapping(value = "/advice",method = RequestMethod.GET)
    public String adviceMethod(){

        return "hello";
    }

    @RequestMapping(value = "/adviceExceptionHandler",method = RequestMethod.GET)
    public void adviceExceptionHandler(){

        System.err.println("NullPointerException--");

        throw new RuntimeException();
    }
}
