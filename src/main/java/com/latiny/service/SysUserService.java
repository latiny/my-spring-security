package com.latiny.service;

import com.latiny.domain.SysPermissionDomain;
import com.latiny.domain.SysUserDomain;

import java.util.List;

/**
 * @author Latiny
 * @version 1.0
 * @description: SysUserService
 * @date 2019/7/17 18:49
 */
public interface SysUserService {

    /**
     * 查询用户
     * @param userName
     * @return
     */
    SysUserDomain findUserByName(String userName);

    /**
     * 查询用户权限
     * @param userName
     * @return
     */
    List<SysPermissionDomain> findPermisionByUserName(String userName);
}
