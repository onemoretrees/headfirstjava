package com.headfirstjava.controller;


import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liuyuhang
 * @date: 2020/11/06
 */
@RestController
@RequestMapping(value = "/adviceDemo")
@Slf4j
public class AdviceController {

    public static Map  map = new HashMap<String,Object>();

    static {
        map.put("1","小刘");
        map.put("2","小黄");
        map.put("3","小花");
        map.put("4","小王");
    }

    @RequestMapping(value = "/advice",method = RequestMethod.GET)
    public String adviceMethod(){

        return "hello";
    }

    @RequestMapping(value = "/adviceExceptionHandler",method = RequestMethod.GET)
    public void adviceExceptionHandler(){

        System.err.println("NullPointerException--");

        throw new RuntimeException();
    }

    @RequestMapping(value = "/beforeMap",method = RequestMethod.GET)
    public String beforeMap(){


        log.info("Controller---"+map.size());

        return new Gson().toJson(map);
    }
}
