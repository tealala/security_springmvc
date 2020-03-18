package com.tealala.security.springmvc.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Data
@Table(name = "t_role")
public class TRole implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 父角色
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 角色英文名
     */
    @Column(name = "ename")
    private String ename;

    /**
     * 角色备注
     */
    @Column(name = "description")
    private String description;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;
}