package com.latiny.domain;

import java.util.Date;

public class SysUserDomain {

    private Long id;

    private String userName;

    private String password;

    private String realName;

    private Long phone;

    private Integer enabled;

    private Integer accountNonExpired;

    private Integer accountNonLocked;

    private Integer credentialsNonExpired;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Integer accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Integer getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Integer accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Integer getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Integer credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}