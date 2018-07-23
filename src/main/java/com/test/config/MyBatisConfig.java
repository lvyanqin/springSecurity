/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config;

import javax.sql.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Administrator
 */
@Configuration
public class MyBatisConfig {
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
        dataSource.setUrl("jdbc:log4jdbc:sqlserver://192.168.1.235;DatabaseName=diyigaokao");
        dataSource.setUsername("zhouyunfeng");
        dataSource.setPassword("zhouyunfeng2233");
        return dataSource;
    }
    
    @Bean(name = "sqlSessionFactory")
    SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setDataSource(dataSource);
        ssfb.setTypeAliasesPackage("com.test.beans");
        return ssfb;
    }
    
    @Bean
    MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setSqlSessionFactoryBeanName("sqlSessionFactory");
        msc.setBasePackage("com.test.mapper");
        return msc;
    }
    
}
