package com.cowain.pms.modules.wms.entity.outerentity;

public enum WmsErpOutStatus {
    CREATED(1,"创建状态"),
    PART_OUT(2,"部分出仓"),
    ALL_OUT(3,"全部出仓"),
    CHECKED(4,"已复核"),
    DELIVERED(5,"已发运"),
    CLOSED(6,"关闭"),
    SYNED(7,"已经回传");

    private int status;
    private String desc ;

    private WmsErpOutStatus(int status,String desc) {
       this.status = status;
       this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
