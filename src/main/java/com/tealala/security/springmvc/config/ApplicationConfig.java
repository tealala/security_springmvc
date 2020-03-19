package com.tealala.security.springmvc.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * 相当于applicationContext.xml文件
 *
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Configuration
@MapperScan(basePackages = "com.tealala.security.springmvc.mapper")
@ComponentScan(basePackages = "com.tealala.security.springmvc", excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class ApplicationConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }
}
