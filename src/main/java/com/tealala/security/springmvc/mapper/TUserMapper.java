package com.tealala.security.springmvc.mapper;

import com.tealala.security.springmvc.domain.TUser;
import com.tealala.tk.mybatis.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
public interface TUserMapper extends MyMapper<TUser> {

    TUser findByUserName(@Param("username") String username);
}