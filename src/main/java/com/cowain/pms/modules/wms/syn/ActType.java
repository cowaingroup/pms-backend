package com.cowain.pms.modules.wms.syn;

/**
 * 存储类型
 */
public enum ActType {
    RECEIVE(1,"收货"),
    CHECK(2,"质检"),
    IN(3,"入库"),
    CREATE(4,"创建"),
    ALLOCATE(5,"分配"),
    PICK(6,"拣货"),
    REVIEW(7,"复核")
    ;
    private final int value;
    private final String desc;

    ActType(int value, String desc){
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
