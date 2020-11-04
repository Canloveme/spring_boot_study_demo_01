/*
package cn.csq.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

*/
/**
 * @author csq
 * @date 2020/11/4 15:44:14
 *//*

package com.hou.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    //配置数据源
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidSource(){
        return new DruidDataSource();
    }

    //配置Druid后台监控
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        Map<String, String> initParameters = new HashMap<>();
        //向里面添加参数
        initParameters.put("loginUsername","admin");
        initParameters.put("loginPassword","123456");
        //设置
        bean.setInitParameters(initParameters);
        return bean;
    }
}*/
