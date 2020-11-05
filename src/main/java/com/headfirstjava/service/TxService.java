package com.headfirstjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: liuyuhang
 * @date: 2020/11/05
 */
@Component
public class TxService {

    private User1Service user1Service;

    private User2Service user2Service;
    @Autowired
    public TxService(User1Service user1Service,User2Service user2Service) {
        this.user1Service = user1Service;
        this.user2Service = user2Service;
    }


    public void notransaction_exception_required_required() {
        this.user1Service.required("张三");
        this.user2Service.required("李四");
        throw new RuntimeException();
    }


    public void notransaction_required_required_exception() {
        this.user1Service.required("张三");
        this.user2Service.required_exception("李四");
    }



    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_exception_required_required() {
        user1Service.required("张三");
        user2Service.required("李四");
        throw new RuntimeException();
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_required_exception() {
        user1Service.required("张三");
        user2Service.required_exception("李四");
    }


    public void notransaction_requiresNew_requiresNew_exception(){
        user1Service.requires_new("张三");
        user2Service.requires_new_exception("李四");
    }



    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_required_exception_try() {
        user1Service.required("张三");
        try {
            user2Service.required_exception("李四");
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }


    public void notransaction_exception_requiresNew_requiresNew(){
        user1Service.requires_new("张三");
        user2Service.requires_new("李四");
        throw new RuntimeException();
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_exception_required_requiresNew_requiresNew() {
        user1Service.required("张三");

        user2Service.requires_new("李四");

        user2Service.requires_new("王五");
        throw new RuntimeException();
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_requiresNew_requiresNew_exception() {
        user1Service.required("张三");

        user2Service.requires_new("李四");

        user2Service.requires_new_exception("王五");
    }



    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_requiresNew_requiresNew_exception_try(){
        user1Service.required("张三");

        user2Service.requires_new("李四");

        try {
            user2Service.requires_new_exception("王五");
        } catch (Exception e) {
            System.out.println("回滚");
        }
    }



    public void notransaction_exception_nested_nested(){
        user1Service.nested("张三");
        user2Service.nested("李四");
        throw new RuntimeException();
    }


    public void notransaction_nested_nested_exception(){
        user1Service.nested("张三");
        user2Service.nested_exception("李四");
    }


    @Transactional
    public void transaction_exception_nested_nested(){
        user1Service.nested("张三");
        user2Service.nested("李四");
        throw new RuntimeException();
    }


    @Transactional
    public void transaction_nested_nested_exception(){
        user1Service.nested("张三");
        user2Service.nested_exception("李四");
    }


    @Transactional
    public void transaction_nested_nested_exception_try(){
        user1Service.nested("张三");
        try {
            user2Service.nested_exception("李四");
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }
}
