package com.tealala.security.springmvc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tealala.security.springmvc.mapper.TRoleMapper;
import com.tealala.security.springmvc.service.TRoleService;
/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Service
public class TRoleServiceImpl implements TRoleService{

    @Resource
    private TRoleMapper tRoleMapper;

}
