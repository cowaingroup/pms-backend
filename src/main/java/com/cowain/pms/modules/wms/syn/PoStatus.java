package com.cowain.pms.modules.wms.syn;

/**
 * ERP 数据状态
 */
public enum PoStatus {
    UNSYNED(1,"创建"),
    SYNED(2,"关闭");

    private final int status;
    private final String desc;

    PoStatus(int status , String desc ){
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
