package com.tealala.security.springmvc.service.impl;

import com.tealala.security.springmvc.domain.TUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tealala.security.springmvc.mapper.TUserMapper;
import com.tealala.security.springmvc.service.TUserService;
/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Service
public class TUserServiceImpl implements TUserService{

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public TUser findByUserName(String username) {
        return tUserMapper.findByUserName(username);
    }
}
