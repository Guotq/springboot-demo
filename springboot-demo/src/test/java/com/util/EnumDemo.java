package com.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

/**
 * 枚举Demo
 * 以学生成绩为例
 * <60分  不及格
 * >=60 && <80 良好
 * >=80 && <90 好
 * >=90 && <=100 优秀
 */
public enum EnumDemo {

    ENUMDEMO_LEVEL1("1","优秀"),
    ENUMDEMO_LEVEL2("2","好"),
    ENUMDEMO_LEVEL3("3","良"),
    ENUMDEMO_LEVEL4("4","不及格");

    private String code;
    private String name;


    public static String getTypeName(String code) {
        for (EnumDemo enumDemo : EnumDemo.values()) {
            if(enumDemo.getCode().equals(code)){
                return enumDemo.getName();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.printf(EnumDemo.getTypeName("3"));
    }

    EnumDemo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

