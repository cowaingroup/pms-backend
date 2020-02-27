package com.cowain.pms.modules.wms.syn;

/**
 *
 */
public enum  WmsOutStatus {
    CREATED(1,"创建"),
    PART_ASSIGN(2,"部分分配"),
    ALL_ASSIGN(3,"分配完成"),//pda已接受任务
    WAIT_PICK(4,"拣货中"),
    PART_PICK(5,"部分拣货"),
    ALL_PICK(6,"拣货完成"),
    WAIT_REVIEW(7,"待复核"),
    PART_REVIEW(8,"部分复核"),
    ALL_REVIEW(9,"复核完成"),
    CANCEL(10,"已取消"),
    SYNED(11,"关闭回传");

    private final int status;
    private final String desc;

    WmsOutStatus(int status , String desc ){
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
