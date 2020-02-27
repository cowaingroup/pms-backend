package com.cowain.pms.modules.wms.syn;

/**
 * 数据记录状态
 */
public enum TaskDocType {
    FORMAL_IN(1,"普通入库单","wms_in_doc"),
    MERGE_IN(2,"汇总入库单","wms_merge_doc"),
    FORMAL_OUT(3,"普通出库单","wms_pick_task"),
    MERGE_OUT(4,"汇总出库单",""),
    FORMAL_CHECK(5,"质检单","wms_reciv_doc");

    private final int status;
    private final String desc;

    private final String table;

    TaskDocType(int status, String desc,String table) {
      this.status = status;
      this.desc = desc ;
      this.table=table;
     }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public String getTable() {
        return table;
    }
}
