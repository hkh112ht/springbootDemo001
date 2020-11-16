package com.hkh112ht.common.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.hkh112ht.common.entity.HelloEntity;

public class HelloRepositoryImpl {

    private final String TABLE_NAME="emp_name";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // データを追加する
    public HelloEntity insert(HelloEntity helloEntity) {
        // 実行する SQL を組み立てる
        SqlParameterSource param = new BeanPropertySqlParameterSource(helloEntity);
        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName(TABLE_NAME)
                .usingGeneratedKeyColumns("id");
        // SQL を実行して、AUTO_INCREMENT の値を取得する
        Number key = insert.executeAndReturnKey(param);
        helloEntity.setId(key.intValue());
        return helloEntity;
    }
}
