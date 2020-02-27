package com.cowain.pms.modules.wms.syn;

/**
 * WCS状态
 */
public  enum WcsStatus {
    UNPUBLISH(1,"未下发"),
    RECEIPT(2,"已接收"),//质检已领取
    REQUEST(3,"已请求"),
    ACT(4,"正在动作"),
    FINISH(5,"已完成"),
    CANCEL(6,"已取消"),
    MERGE(7,"已合并");

    private final int status;
    private final String desc;

    WcsStatus(int status , String desc ){
        this.status = status;
        this.desc = desc ;
    }

    // 普通方法
    public static String getDesc(int status) {
        for (WcsStatus c : WcsStatus.values()) {
            if (c.getStatus() == status) {
                return c.desc;
            }
        }
        return null;
    }
    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
