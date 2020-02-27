package com.cowain.pms.modules.wms.syn;

/**
 * ERP 数据状态
 */
public enum CheckStatus {
    QULIFI(1,"合格接收"),
    UNQULIFI(2,"不合格接收"),
    UNRECIPT(3,"不合格拒收");

    private final int status;
    private final String desc;

    CheckStatus(int status , String desc ){
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
