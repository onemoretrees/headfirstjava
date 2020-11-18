package com.headfirstjava;

import com.headfirstjava.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author: liuyuhang
 * @date: 2020/11/18
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Resource
    LoginInterceptor loginInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
        .addPathPatterns("/**")
        .excludePathPatterns("/login")
        .excludePathPatterns("/file/**");
    }
}
