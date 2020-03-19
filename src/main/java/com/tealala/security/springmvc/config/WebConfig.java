package com.tealala.security.springmvc.config;

import com.tealala.security.springmvc.interceptor.SimpleAuthticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 相当于springmvc.xml文件的配置
 *
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tealala.security.springmvc", includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class WebConfig implements WebMvcConfigurer {

    //    @Bean
    //    public BCryptPasswordEncoder passwordEncoder() {
    //        return new BCryptPasswordEncoder();
    //    }

    @Autowired
    private SimpleAuthticationInterceptor simpleAuthticationInterceptor;

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(simpleAuthticationInterceptor).addPathPatterns("/user","/content");
    }
}
