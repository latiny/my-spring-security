package com.latiny.mapper;

import com.latiny.domain.SysPermissionDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysPermissionDomainMapper {

    List<SysPermissionDomain> findPermisionByUserName(String userName);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermissionDomain record);

    int insertSelective(SysPermissionDomain record);

    SysPermissionDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermissionDomain record);

    int updateByPrimaryKey(SysPermissionDomain record);
}