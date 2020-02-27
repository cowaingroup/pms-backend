package com.cowain.pms.modules.wms.syn;


/**
 * 数据记录状态
 */
public enum AlloStatus {
    SUCCESS(2,"已分配"),FAILURE(1,"未分配");

    private final int status;
    private final String desc;

    AlloStatus (int status,String desc) {
        this.status = status;
        this.desc = desc ;
    }

    public int getStatus() {
        return status;
    }
}
