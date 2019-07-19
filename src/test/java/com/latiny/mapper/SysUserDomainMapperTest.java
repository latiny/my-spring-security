package com.latiny.mapper;

import com.latiny.domain.SysUserDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author Latiny
 * @version 1.0
 * @description: SysUserTest
 * @date 2019/7/18 15:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SysUserDomainMapperTest {

    @Autowired
    private SysUserDomainMapper sysUserDomainMapper;

    @Test
    public void findUserByName() throws Exception {
        SysUserDomain userDomain = sysUserDomainMapper.findUserByName("latiny");
        System.out.println(userDomain.getUserName() + ", " + userDomain.getRealName());
    }

    @Test
    public void findPermisionByUserName() throws Exception {
    }

}