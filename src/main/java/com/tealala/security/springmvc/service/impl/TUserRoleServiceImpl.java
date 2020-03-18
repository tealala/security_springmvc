package com.tealala.security.springmvc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tealala.security.springmvc.mapper.TUserRoleMapper;
import com.tealala.security.springmvc.service.TUserRoleService;
/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Service
public class TUserRoleServiceImpl implements TUserRoleService{

    @Resource
    private TUserRoleMapper tUserRoleMapper;

}
