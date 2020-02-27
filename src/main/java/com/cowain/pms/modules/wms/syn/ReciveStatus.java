package com.cowain.pms.modules.wms.syn;

/**
 * 仓储状态
 */
public  enum ReciveStatus {
    CREATED(1,"收货完成"),
    PARTCHECK(2,"部分质检"),
    ALLCHECK(3,"质检完成"),
    CANCELED(4,"已取消"),
    REQUEST(5,"创建");

    private final int status;
    private final String desc;

    ReciveStatus(int status , String desc ){
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
