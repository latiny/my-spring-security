package com.latiny.mapper;

import com.latiny.domain.RolePermissionDomain;

public interface RolePermissionDomainMapper {

    int insert(RolePermissionDomain record);

    int insertSelective(RolePermissionDomain record);
}