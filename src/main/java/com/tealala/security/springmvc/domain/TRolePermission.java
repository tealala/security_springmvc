package com.tealala.security.springmvc.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * @author zhuxiaoyu@digidite.com
 * @date 2020/3/18
 */
@Data
@Table(name = "t_role_permission")
public class TRolePermission implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "permission_id")
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}