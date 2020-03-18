package com.tealala.security.springmvc.dto;

import lombok.Data;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Data
public class UserDto {
    /**
     * 用户的身份信息
     */
    private Long id;

    private String username;

    private String password;


}
