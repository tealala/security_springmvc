package com.tealala.tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/17
 */
public interface MyMapper<T> extends Mapper<T> ,MySqlMapper<T>{
}
