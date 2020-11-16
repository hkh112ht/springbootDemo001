package com.hkh112ht.common.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Accessors(chain = true)
@SuperBuilder
@Table("EMP_NAME")
public class HelloEntity {
    @Id
//    @Wither
    @Column("id")
    private int id;

    @Column("name")
    private String name;

}
