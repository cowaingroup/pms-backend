package com.cowain.pms.modules.wms.syn;


/**
 * 数据记录状态
 */
public enum OutTaskStatus {
   ALLOCATE(1,"分配完成"),
    PICK(2,"拣货完成"),
    REVIEW(3,"复核完成");

    private final int status;
    private final String desc;

    OutTaskStatus(int status, String desc) {
        this.status = status;
        this.desc = desc ;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
