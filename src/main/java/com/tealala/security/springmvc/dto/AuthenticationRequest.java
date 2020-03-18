package com.tealala.security.springmvc.dto;

import lombok.Data;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Data
public class AuthenticationRequest {
    /**
     * 用户的认证信息：用户名，密码
     */

    private String username;

    private String password;
}
