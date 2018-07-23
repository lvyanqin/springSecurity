/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.rememberme.TokenBasedRememberMeServices;

/**
 *
 * @author Administrator
 */
public class MyRemeberMeService extends TokenBasedRememberMeServices{
    
    public MyRemeberMeService(String key, UserDetailsService userDetailsService) {
        super(key, userDetailsService);
    }
    
}
