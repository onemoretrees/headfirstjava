package com.headfirstjava.interceptor;


import com.headfirstjava.controller.AdviceController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author: liuyuhang
 * @date: 2020/11/18
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        log.info("info---log");
        log.info("Interceptor---"+AdviceController.map.size());
        if(AdviceController.map.containsKey("1")){
            log.error("登陆失败");
            return false;
        }else {
            return true;
        }
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
        throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }

}
