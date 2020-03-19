package com.tealala.security.springmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Data
@AllArgsConstructor
public class UserDto {
    public final static String SESSION_USER_KEY="_user";

    /**
     * 用户的身份信息
     */
    private Long id;

    private String username;

    private String password;

    private Set<String> authorities;




}
