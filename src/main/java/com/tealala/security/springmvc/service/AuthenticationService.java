package com.tealala.security.springmvc.service;

import com.tealala.security.springmvc.domain.TUser;
import com.tealala.security.springmvc.dto.AuthenticationRequest;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
public interface AuthenticationService {

    TUser authentication(AuthenticationRequest request) throws Exception;
}
