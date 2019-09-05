package com.iweb.my_order.service;

import com.iweb.my_order.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    void login();

    User loginByName(User user);

    int saveUser(User user);
}
