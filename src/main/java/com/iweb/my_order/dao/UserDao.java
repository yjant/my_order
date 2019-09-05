package com.iweb.my_order.dao;

import com.iweb.my_order.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    void login();
    User loginByName(String username);

    int saveUser(User user);
}
