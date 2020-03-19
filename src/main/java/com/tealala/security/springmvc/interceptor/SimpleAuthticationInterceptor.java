package com.tealala.security.springmvc.interceptor;

import com.tealala.security.springmvc.dto.UserDto;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/19
 */
@Configuration
public class SimpleAuthticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        Object object = request.getSession().getAttribute(UserDto.SESSION_USER_KEY);
        if(object == null){
            writenResponse(response,"请登陆系统");
        }
        UserDto userDto = (UserDto) object;
        String uri = request.getRequestURI();
        if(userDto.getAuthorities().contains(uri)){
            return true;
        }else {
            writenResponse(response,"没有权限拒绝访问");
        }
        return false;
    }

    private void writenResponse(HttpServletResponse response, String msg) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter writer  = response.getWriter();
        writer.write(msg);
        writer.close();
        response.resetBuffer();
    }
}
