/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
public class test {
    
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }
    
    @RequestMapping("/test3")
    @ResponseBody
    public String test3(){
        return "test3";
    }
    
    @RequestMapping("/test4")
    @ResponseBody
    public String test4(){
        return "test4";
    }
    
    @RequestMapping("/show")
    public ModelAndView show(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("show", "djlajflkdsjflakjdsflakjklfd");
        mv.setViewName("/show");
        return mv;
    }
    
    @RequestMapping(value = {"/index", "/"})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        String principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        mv.addObject("principal", principal);
        mv.setViewName("/index");
        return mv;
    }
    
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }
    
}
