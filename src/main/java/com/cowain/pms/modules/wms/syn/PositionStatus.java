package com.cowain.pms.modules.wms.syn;

/**
 * 移库单状态
 */
public  enum PositionStatus {
    FREE("1","空闲"),
    USING("2","占用"),
    FULL("3","已满"),
    PAUSE("4","停用");

    private final String status;
    private final String desc;

    PositionStatus(String status , String desc ){
        this.status = status;
        this.desc = desc ;
    }

    // 普通方法
    public static String getDesc(String status) {
        for (PositionStatus c : PositionStatus.values()) {
            if (c.getStatus() == status) {
                return c.desc;
            }
        }
        return null;
    }
    public String getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
