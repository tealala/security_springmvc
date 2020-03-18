package com.tealala.security.springmvc.controller;

import com.tealala.security.springmvc.domain.TUser;
import com.tealala.security.springmvc.dto.AuthenticationRequest;
import com.tealala.security.springmvc.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping("/login")
    public String login(AuthenticationRequest request){
        try {
            TUser user = authenticationService.authentication(request);
            return user.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
