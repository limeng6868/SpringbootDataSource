package com.example.springbootdatasource.dao.dataSource1;

import com.example.springbootdatasource.model.User;

import java.util.List;

/**
 * @author limeng
 * @date 2019/1/12 9:28
 */
public interface UserMapper1 {

    User findByName(String name);

   List<User> findUserList();
}
