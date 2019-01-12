package com.example.springbootdatasource.controller;

import com.example.springbootdatasource.dao.dataSource1.UserMapper1;
import com.example.springbootdatasource.dao.dataSource2.UserMapper2;
import com.example.springbootdatasource.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;

/**
 * @author limeng
 * @date 2019/1/12 9:47
 */

@Controller
@RequestMapping
public class SpringBootController {

    final static Logger logger = LoggerFactory.getLogger(SpringBootController.class);

    @Autowired
    UserMapper1 userMapper1;

    @Autowired
    UserMapper2 userMapper2;

    public Object getSub(){
        User user = userMapper1.findByName(userMapper1.findUserList().get(0).getUsername());
        User user1 = userMapper2.findByName("李四");
        logger.info(user+"/n"+user1);
        return null;
    }
}
