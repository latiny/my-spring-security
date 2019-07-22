package com.latiny.service.impl;

import com.latiny.domain.SysPermissionDomain;
import com.latiny.domain.SysUserDomain;
import com.latiny.mapper.SysPermissionDomainMapper;
import com.latiny.mapper.SysUserDomainMapper;
import com.latiny.model.SysPermission;
import com.latiny.model.SysUser;
import com.latiny.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Latiny
 * @version 1.0
 * @description: SysUserServiceImpl
 * @date 2019/7/17 18:50
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDomainMapper sysUserDomainMapper;
    @Autowired
    private SysPermissionDomainMapper sysPermissionDomainMapper;

    @Override
    public SysUser findUserByName(String userName) {
        SysUserDomain userDomain = sysUserDomainMapper.findUserByName(userName);
        return SysUserConvertUtil.sysUserDomain2SysUser(userDomain);
    }

    @Override
    public List<SysPermission> findPermisionByUserName(String userName) {
        List<SysPermissionDomain> listPermissionDomain = sysPermissionDomainMapper.findPermisionByUserName(userName);
        return SysUserConvertUtil.sysPermissionDomain2SysPermission(listPermissionDomain);
    }
}

class SysUserConvertUtil {

    public static SysUser sysUserDomain2SysUser(SysUserDomain userDomain) {
        if (null == userDomain) {
            return null;
        }
        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(userDomain, sysUser);
        sysUser.setUsername(userDomain.getUserName());

        if (userDomain.getAccountNonExpired() == 0) {
            sysUser.setAccountNonExpired(false);
        }
        if (userDomain.getAccountNonExpired() == 1) {
            sysUser.setAccountNonExpired(true);
        }

        if (userDomain.getAccountNonLocked() == 0) {
            sysUser.setAccountNonLocked(false);
        }
        if (userDomain.getAccountNonLocked() == 1) {
            sysUser.setAccountNonLocked(true);
        }

        if (userDomain.getEnabled() == 1) {
            sysUser.setEnabled(true);
        }
        if (userDomain.getEnabled() == 0) {
            sysUser.setEnabled(false);
        }

        if (userDomain.getCredentialsNonExpired() == 0) {
            sysUser.setCredentialsNonExpired(false);
        }
        if (userDomain.getCredentialsNonExpired() == 1) {
            sysUser.setCredentialsNonExpired(true);
        }

        return sysUser;
    }

    public static List<SysPermission> sysPermissionDomain2SysPermission(List<SysPermissionDomain> listPermissionDomain) {
        if (CollectionUtils.isEmpty(listPermissionDomain)) {
            return null;
        }
        List<SysPermission> listSysPermission = new ArrayList<>(listPermissionDomain.size());
        for (SysPermissionDomain permissionDomain : listPermissionDomain) {
            SysPermission sysPermission = new SysPermission();
            BeanUtils.copyProperties(permissionDomain, sysPermission);
            listSysPermission.add(sysPermission);
        }
        return listSysPermission;
    }
}
