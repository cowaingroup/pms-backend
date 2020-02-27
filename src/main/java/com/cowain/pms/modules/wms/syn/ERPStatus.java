package com.cowain.pms.modules.wms.syn;

/**
 * ERP 数据状态
 */
public enum ERPStatus {
    UNSYNED(1,"未回传"),
    SYNED(2,"已回传");

    private final int status;
    private final String desc;

    ERPStatus(int status , String desc ){
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
