package com.hkh112ht.common.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hkh112ht.common.entity.HelloEntity;

@Repository
public interface HelloRepository extends CrudRepository <HelloEntity, String> {


}
