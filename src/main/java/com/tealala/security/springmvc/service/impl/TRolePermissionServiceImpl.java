package com.tealala.security.springmvc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tealala.security.springmvc.mapper.TRolePermissionMapper;
import com.tealala.security.springmvc.service.TRolePermissionService;
/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Service
public class TRolePermissionServiceImpl implements TRolePermissionService{

    @Resource
    private TRolePermissionMapper tRolePermissionMapper;

}
