package com.latiny.mapper;

import com.latiny.domain.SysPermissionDomain;

public interface SysPermissionDomainMapper {

    int insert(SysPermissionDomain record);

    int insertSelective(SysPermissionDomain record);
}