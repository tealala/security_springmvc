package com.tealala.security.springmvc.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tealala.security.springmvc.mapper.TPermissionMapper;
import com.tealala.security.springmvc.service.TPermissionService;
/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Service
public class TPermissionServiceImpl implements TPermissionService{

    @Resource
    private TPermissionMapper tPermissionMapper;

}
