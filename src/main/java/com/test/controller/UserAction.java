/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.controller;

import com.test.beans.UserBean;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
public class UserAction {
    
    @Autowired
    private UserMapper userMapper;
    
    @RequestMapping(value = "/user")
    @ResponseBody
    public String user(){
        UserBean user = userMapper.findById(48);
        return "1";
    }
    
}
