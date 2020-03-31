package com.util;

public enum ChargeType {
    CHARGE_TYPE_CHARGED(10131001, "自费"),
    CHARGE_TYPE_FREE(10131002, "免费"),
    CHARGE_TYPE_MEMBER_RIGHTS(10131003, "会员权益");
    private Integer code;
    private String name;

    private ChargeType(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getTypeName(Integer code) {
        for (ChargeType type : ChargeType.values()) {
            if (type.code.equals(code)) {
                return type.getName();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String typeName = ChargeType.getTypeName(10131002);
        System.out.println(typeName); //输出结果：自费

    }


}
