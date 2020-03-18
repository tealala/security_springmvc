package com.tealala.security.springmvc.init;

import com.tealala.security.springmvc.config.ApplicationConfig;
import com.tealala.security.springmvc.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Spring容器,相当于加载 applicationContext.xml
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    /**
     * servletContext,相当于加载 springmvc.xml
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * url-mapping
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
