package com.iweb.my_order.service.serviceImpl;

import com.iweb.my_order.dao.UserDao;
import com.iweb.my_order.entity.User;
import com.iweb.my_order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private User user;

    @Override
    public void login() {
    }

    @Override
    public User loginByName(User user) {
        String username = user.getUsername();
        user = userDao.loginByName(username);
        if (user==null){
            throw new RuntimeException( "账号或者密码错误，请重新输入" );
        }
        return user;
    }

    @Override
    public int saveUser(User user) {

        User find_user = userDao.loginByName( user.getUsername() );
        if (find_user!=null){
            throw new RuntimeException( "用户名已经存在！不可用此用户名注册" );
        }
        return userDao.saveUser(user);
    }
}
