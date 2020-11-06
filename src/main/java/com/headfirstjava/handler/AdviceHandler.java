package com.headfirstjava.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author: liuyuhang
 * @date: 2020/11/06
 */
@Slf4j
@RestControllerAdvice
public class AdviceHandler {

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        log.error("@InitBinder@InitBinder@InitBinder@InitBinder");
    }


    @ExceptionHandler(NullPointerException.class)
    public void handleBusinessException(NullPointerException e) {
        System.err.println("NullPointerException");
        e.printStackTrace();
        log.error(e.getMessage());
    }


}
