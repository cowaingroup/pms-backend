package com.cowain.pms.modules.wms.syn;

/**
 * 移库单状态
 */
public  enum MoveStatus {
    CREATED(1,"创建"),
    PARTIN(2,"部分执行"),
    ALLIN(3,"执行完成"),
    SYNED(4,"关闭回传"),
    FAILED(5,"失败");

    private final int status;
    private final String desc;

    MoveStatus(int status , String desc ){
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
