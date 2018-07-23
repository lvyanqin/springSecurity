/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Administrator
 */
public class UserInfo implements UserDetails{
    
    private final Collection<GrantedAuthority> authorities;
    private final String password;
    private final String username;
    private final boolean  accountNonExpired;
    private final boolean accountNonLocked;
    private final boolean enable;
    private final boolean credentialsNonExpired;

    public UserInfo(Collection<GrantedAuthority> authorities, String password, String username, boolean accountNonExpired, boolean accountNonLocked, boolean enable, boolean credentialsNonExpired) {
        this.authorities = authorities;
        this.password = password;
        this.username = username;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.enable = enable;
        this.credentialsNonExpired = credentialsNonExpired;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }
    
}
