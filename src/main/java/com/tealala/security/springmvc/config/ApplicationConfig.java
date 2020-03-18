package com.tealala.security.springmvc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 相当于applicationContext.xml文件
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Configuration
@MapperScan(basePackages = "com.tealala.security.springmvc.mapper")
@ComponentScan(basePackages = "com.tealala.security.springmvc", excludeFilters = {@ComponentScan.Filter(type = FilterType
    .ANNOTATION, value = Controller.class)})
public class ApplicationConfig {
}
