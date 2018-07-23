/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.RequestMatcher;

/**
 *
 * @author Administrator
 */
@Configuration
@EnableWebSecurity//启用web安全性，本身并没有什么用处   spring mvc @EnableWebSecurity用@EnableWebMvcSecurity替换
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().requireCsrfProtectionMatcher(myCsrfMatcher());
        
//        http.rememberMe().rememberMeServices(rememberMeServices);
        
        http.authorizeRequests()
                .antMatchers("/show").authenticated()
                .antMatchers("/test").authenticated()
                .antMatchers(HttpMethod.GET, "/test1").authenticated()
                .antMatchers("/test2").access("hasRole('1') and hasIpAddress('192.168.1.42')")
                .anyRequest().permitAll()
            .and()
            .requiresChannel()
                .antMatchers("/test3").requiresSecure()  //需要https
                .antMatchers("/test4").requiresInsecure()  //转到http
              
            .and()
            .formLogin()
                .loginPage("/login")
            
            .and()
//            .rememberMe() //记住我
//                .tokenValiditySeconds(2419200)
//                .key("key") //在cookie中存储一个token，token包含用户名、密码、过期时间和一个私钥，进行MD5加密，私钥默认SpringSecured
//            .and()
            .logout()
            .logoutSuccessUrl("/")
            .and()
            .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication() //启用内存用户存储
                .withUser("1").password("1").roles("1").and()
                .withUser("2").password("2").authorities("ROLE_2");
    }
    
    @Bean
    //自定义csrf处理程序
    public RequestMatcher myCsrfMatcher(){
        RequestMatcher requestMatcher = new MyCsrfRequestMatcher();
        return requestMatcher;
    }
    
//    @Bean
//    public UserDetailsService userDetailsServiceBean() throws Exception {
//        return super.userDetailsServiceBean();
//    }
    
//    @Bean
//    public MyRemeberMeService myRemeberMeService(){
//        MyRemeberMeService mrms = new MyRemeberMeService(key, userDetailsService);
//        mrms.setAlwaysRemember(false);
//        mrms.setTokenValiditySeconds(1209600);
//        mrms.setCookieName("SECURITY_REMEBERME");
//        mrms.setParameter("isRemeberMe");
//        return mrms;
//    }

}
