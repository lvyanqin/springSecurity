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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping(value = "/user/init")
    public ModelAndView userHtml(Integer id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/user");
        return mv;
    }
    
    @RequestMapping(value = "/user/test", method = RequestMethod.POST)
    @ResponseBody
    public String testRestfulPost(Integer id){
        UserBean user = userMapper.findById(id);
        return "2";
    }
    
    @RequestMapping(value = "/user/test2/{flag}", method = RequestMethod.POST)
    @ResponseBody
    public String testRestfulPost2(@PathVariable String flag, Integer id){
        UserBean user = userMapper.findById(id);
        return flag;
    }
    
}
