package com.latiny.service.impl;

import com.latiny.domain.SysPermissionDomain;
import com.latiny.domain.SysUserDomain;
import com.latiny.service.SysUserService;

import java.util.List;

/**
 * @author Latiny
 * @version 1.0
 * @description: SysUserServiceImpl
 * @date 2019/7/17 18:50
 */
public class SysUserServiceImpl implements SysUserService {

    @Override
    public SysUserDomain findUserByName(String userName) {
        return null;
    }

    @Override
    public List<SysPermissionDomain> findPermisionByUserName(String userName) {
        return null;
    }
}
