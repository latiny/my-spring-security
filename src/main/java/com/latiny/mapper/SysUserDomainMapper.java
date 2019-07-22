package com.latiny.mapper;

import com.latiny.domain.SysPermissionDomain;
import com.latiny.domain.SysUserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SysUserDomainMapper {

    int insert(SysUserDomain record);

    int insertSelective(SysUserDomain record);

    /**
     * 查询用户
     * @param userName
     * @return
     */
    SysUserDomain findUserByName(@Param("userName") String userName);

    /**
     * 查询用户权限
     * @param userName
     * @return
     */
    List<SysPermissionDomain> findPermisionByUserName(String userName);
}