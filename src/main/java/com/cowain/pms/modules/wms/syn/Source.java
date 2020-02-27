package com.cowain.pms.modules.wms.syn;

/**
 * 数据来源
 */
public enum  Source {
    ERP(1,"erp"),
    WMS(2,"wms");

    private final int value ;
    private final String desc;
    Source(int value ,String desc ){
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
