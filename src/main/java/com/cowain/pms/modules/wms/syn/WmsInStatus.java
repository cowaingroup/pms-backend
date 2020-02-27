package com.cowain.pms.modules.wms.syn;

/**
 * 仓储状态
 */
public  enum WmsInStatus {
    CREATED(1,"创建"),
    PARTIN(4,"部分入库"),
    ALLIN(5,"入库完成"),
    CANCELED(6,"已取消"),
    SYNED(7,"关闭回传");

    private final int status;
    private final String desc;

    WmsInStatus(int status , String desc ){
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
