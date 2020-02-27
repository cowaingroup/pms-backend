package com.cowain.pms.modules.wms.syn;

/**
 * ERP 数据状态
 */
public enum ActStatus {
    EXECUTED(2,"已回传"),
    UNEXCUTED(1,"未回传");

    private final int status;
    private final String desc;

    ActStatus(int status , String desc ){
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
