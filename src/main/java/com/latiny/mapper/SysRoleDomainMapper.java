package com.latiny.mapper;

import com.latiny.domain.SysRoleDomain;

public interface SysRoleDomainMapper {

    int insert(SysRoleDomain record);

    int insertSelective(SysRoleDomain record);
}