package com.cowain.pms.modules.wms.syn;

/**
 * 存储类型
 */
public enum  StoreType {
    IN(1,"入库"),
    OUT(2,"出库");

    private final int value;
    private final String desc;

    StoreType(int value,String desc){
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
