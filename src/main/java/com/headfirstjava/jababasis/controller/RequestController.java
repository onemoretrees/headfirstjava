package com.headfirstjava.jababasis.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: liuyuhang
 * @date: 2020/11/05
 */
@RestController
@RequestMapping("/requestDemo")
public class RequestController {

    /**
     * 下面代码参考链接
     * https://www.cnblogs.com/qq78292959/p/3760560.html
     */

    /**
     * 访问地址
     * http://localhost:8080/requestDemo/specificValue
     * @return
     */
    @GetMapping("/specificValue")
    public String specificValue(){
        return "具体值返回";
    }


    /**
     * 访问地址
     * http://localhost:8080/requestDemo/uriPattern/uriPattern
     * 参考链接
     * https://blog.csdn.net/weixin_33698823/article/details/89289424
     * @param uriPattern
     * @return
     */
    @GetMapping("/uriPattern/{uriPattern}")
    public String uriPattern(@PathVariable String uriPattern){


        return "urePattern 值"+uriPattern;
    }


}
