package com.tealala.security.springmvc.service.impl;

import com.tealala.security.springmvc.domain.TUser;
import com.tealala.security.springmvc.dto.AuthenticationRequest;
import com.tealala.security.springmvc.service.AuthenticationService;
import com.tealala.security.springmvc.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private TUserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public TUser authentication(AuthenticationRequest request) throws Exception {
        TUser user = userService.findByUserName(request.getUsername());
        if (user == null || !user.getPassword().equals(passwordEncoder.encode(request.getPassword()))) {
            throw new IllegalAccessException("用户名或密码错误");
        }
        return user;
    }
}
