package com.hkh112ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hkh112ht.common.entity.HelloEntity;

@Mapper
public interface HelloMapper {

    List<HelloEntity> selectEmpAll();
}