package com.latiny.security.service;

import com.latiny.model.SysPermission;
import com.latiny.model.SysUser;
import com.latiny.service.SysUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Latiny
 * @version 1.0
 * @description: 自定义UserDetailsService
 * @date 2019/7/12 17:39
 */
public class MyUserDetailService implements UserDetailsService {

    private Logger logger = Logger.getLogger(MyUserDetailService.class);

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.findUserByName(userName);
        List<SysPermission> sysPermissionList = sysUserService.findPermisionByUserName(userName);
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (SysPermission sysPermission : sysPermissionList) {
            GrantedAuthority authority = new SimpleGrantedAuthority(sysPermission.getPermissionCode());
            authorities.add(authority);
        }
        sysUser.setAuthorities(authorities);
        logger.info(sysUser);
        return sysUser;
    }
}
