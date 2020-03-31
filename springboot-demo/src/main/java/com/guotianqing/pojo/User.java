package com.guotianqing.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="t_user") //映射表
public class User {


    @Id
    @KeySql(useGeneratedKeys = true)
    private String id;
    //姓名
    private String name;

}
