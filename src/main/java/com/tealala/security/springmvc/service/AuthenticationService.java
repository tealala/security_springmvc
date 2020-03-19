package com.tealala.security.springmvc.service;

import com.tealala.security.springmvc.dto.AuthenticationRequest;
import com.tealala.security.springmvc.dto.UserDto;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/19
 */
public interface AuthenticationService {

    UserDto authentication(AuthenticationRequest request) throws Exception;
}
