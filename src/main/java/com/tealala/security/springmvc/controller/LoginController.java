package com.tealala.security.springmvc.controller;

import com.tealala.security.springmvc.dto.AuthenticationRequest;
import com.tealala.security.springmvc.dto.UserDto;
import com.tealala.security.springmvc.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/login" ,produces = "application/json;charset=UTF-8")
    public String login(AuthenticationRequest request, HttpSession httpSession){
        try {
            UserDto user = authenticationService.authentication(request);
            httpSession.setAttribute(UserDto.SESSION_USER_KEY, user);
            return user.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }


    @RequestMapping(value = "/user" ,produces = "application/json;charset=UTF-8")
    public String finduser(HttpSession httpSession){
        try {
            UserDto userDto = (UserDto)httpSession.getAttribute(UserDto.SESSION_USER_KEY);
            if(userDto == null){
                return "还未登陆";
            }
            return userDto.toString() +":  用户信息查询";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/content" ,produces = "application/json;charset=UTF-8")
    public String findContent(HttpSession httpSession){
        try {
            UserDto userDto = (UserDto)httpSession.getAttribute(UserDto.SESSION_USER_KEY);
            if(userDto == null){
                return "还未登陆";
            }
            return userDto.toString() +":  文章内容信息查询";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/loginout" ,produces = "application/json;charset=UTF-8")
    public String loginout(HttpSession httpSession){
        try {
            httpSession.invalidate();
            return "退出成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
