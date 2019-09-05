package com.iweb.my_order.controller;


import com.iweb.my_order.entity.Commodity;
import com.iweb.my_order.entity.User;
import com.iweb.my_order.service.CommodityService;
import com.iweb.my_order.service.UserService;
import com.iweb.my_order.utils.UtilResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController

public class WebController {
    @Autowired
    private UserService userService;
    @Autowired
    private CommodityService commodityService;

    @RequestMapping("index.html")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName( "index" );
        return mav;
    }

    @RequestMapping("search.html")
    public ModelAndView search() {
        return new ModelAndView( "search" );
    }

    @RequestMapping("item.html")
    public ModelAndView item() {
        return new ModelAndView( "item" );
    }

    @RequestMapping("order.html")
    public ModelAndView order() {
        return new ModelAndView( "order" );
    }

    @RequestMapping("success.html")
    public ModelAndView success() {
        return new ModelAndView( "success" );
    }

    @RequestMapping("login")
    @ResponseBody
    public UtilResult login(HttpSession session, User user) {
        UtilResult utilResult = new UtilResult();
        Object user1 = session.getAttribute( "user" );
        try {
            if (user1 != null) {
                utilResult.setOK( false );
                utilResult.setMessage( "已经有账号登录！" );
            } else {
                user = userService.loginByName( user );
                session.setAttribute( "user", user );
                utilResult.setOK( true );
                utilResult.setMessage( "登录成功" );
            }
        } catch (Exception e) {
            utilResult.setOK( false );
            utilResult.setMessage( e.getMessage() );
            e.printStackTrace();
        }
        return utilResult;
    }

    @ResponseBody
    @RequestMapping("regsiter")
    public UtilResult regsiter(User user) {
        UtilResult utilResult = new UtilResult();

        try {
            int num = userService.saveUser( user );
            if (num == 1) {
                utilResult.setOK( true );
                utilResult.setMessage( "注册成功" );
            }

        } catch (Exception e) {
            utilResult.setOK( false );
            utilResult.setMessage( e.getMessage() );
        }
        return utilResult;
    }

    @ResponseBody
    @RequestMapping("loginout")
    public UtilResult loginout(HttpSession httpSession) {
        UtilResult utilResult = new UtilResult();
        try {
            httpSession.invalidate();
            utilResult.setOK( true );
            utilResult.setMessage( "退出成功！" );

        } catch (Exception e) {
            utilResult.setOK( false );
            utilResult.setMessage( e.getMessage() );
            e.printStackTrace();
        }
        return utilResult;
    }

    @ResponseBody
    @RequestMapping("search")
    public List<Commodity> searchCommodity(String name){
//        name="笔记本";
        List<Commodity> commodities =commodityService.queryByName(name);
        return commodities;
    }

    @ResponseBody
    @RequestMapping("detail")
    public Commodity searchById(Integer id){
        Commodity commodity = commodityService.searchById(id);
        return commodity;



    }





}
