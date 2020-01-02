package com.ruin.mybatis.model;

import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Column(name = "user_id")
    @GeneratedValue(generator = "JDBC")
    private Long userId;

    private Integer age;

    @Column(name = "user_name")
    private String userName;

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}