package com.qyg.controller;

import com.qyg.entity.User;
import com.qyg.service.UserService;

/**
 * Created by gege on 2018/7/1.
 */
public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserService();

        User user =new User();
        user.setId("222");

        System.out.println(userService.findById(user.getId()));

    }

    public void m1(){

    }

    public void m2(){
    }

    public  void  m3(){
        System.out.println("m3");
    }
}
