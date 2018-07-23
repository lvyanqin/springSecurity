/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mapper;

import com.test.beans.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author Administrator
 */
public interface UserMapper {
    
    @Select("select * from [User] where id =#{id}")
    UserBean findById(@Param("id") int id);
    
}
