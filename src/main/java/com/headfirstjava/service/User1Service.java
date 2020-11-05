package com.headfirstjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: liuyuhang
 * @date: 2020/11/05
 */
@Component
public class User1Service {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public User1Service(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void required(String name) {
        this.jdbcTemplate.update("insert into user1(name) VALUES (?)", name);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requires_new(String name) {
        this.jdbcTemplate.update("insert into user1(name) VALUES (?)", name);
    }


    @Transactional(propagation = Propagation.NESTED)
    public void nested(String name) {
        this.jdbcTemplate.update("insert into user1(name) VALUES (?)", name);
    }
}
