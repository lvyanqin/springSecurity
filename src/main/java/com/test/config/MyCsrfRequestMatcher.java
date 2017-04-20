/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import org.springframework.security.web.util.matcher.RequestMatcher;

/**
 *
 * @author Administrator
 */
public class MyCsrfRequestMatcher implements RequestMatcher{

    private Pattern allowMethod = Pattern.compile("^(GET|HEAD|OPTIONS|TRACE)$");
    
    private final static Map notAuthenUrl = new HashMap(){
        {
            put("1", "/test5");
        }   
    };
    
    @Override
    public boolean matches(HttpServletRequest request) { //true要进行CSRF验证，false不用进行验证
        boolean value = !allowMethod.matcher(request.getMethod()).matches();
        
        if(value && notAuthenUrl.containsValue(request.getServletPath())){
            return false;
        }
        
        return value;
    }
    
}
