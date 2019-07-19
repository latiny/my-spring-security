package com.latiny.domain;

public class UserRoleDomain {
    private Long id;

    private Long userId;

    private String roleCode;

    private Long cT;

    private Long uT;

    private Byte isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Long getcT() {
        return cT;
    }

    public void setcT(Long cT) {
        this.cT = cT;
    }

    public Long getuT() {
        return uT;
    }

    public void setuT(Long uT) {
        this.uT = uT;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}