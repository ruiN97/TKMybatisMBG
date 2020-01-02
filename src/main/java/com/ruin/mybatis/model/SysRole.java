package com.ruin.mybatis.model;

import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    @Column(name = "role_id")
    @GeneratedValue(generator = "JDBC")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    /**
     * @return role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}