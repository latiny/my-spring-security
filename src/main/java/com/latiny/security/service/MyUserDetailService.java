package com.latiny.security.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author Latiny
 * @version 1.0
 * @description: 自定义UserDetailsService
 * @date 2019/7/12 17:39
 */
public class MyUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String userName = "latiny";
        String password = "abc123";
        User user = new User(userName, password, AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER, ROLE_ADMIN"));

        return user;
    }
}
