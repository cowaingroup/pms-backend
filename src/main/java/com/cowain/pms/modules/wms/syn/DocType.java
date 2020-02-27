package com.cowain.pms.modules.wms.syn;

/**
 * 单据类型
 */
public enum  DocType {
    MERGE_IN(12,"汇总单","HZRK",""),
    STANDARD_IN (1,"标准入库","BZRK","BZSH"),
    MISC_IN(2,"杂收","ZSRK","ZSSH"),
    COMPLETE_IN(3,"完工入库","WGRK",""),
    MATERIAL_IN(4,"材料入库","CLRK",""),
    SALE_RET_IN(5,"销售退回收货单","XTRK",""),
    ADJUST_IN(6,"调入单","DRRK",""),


    STANDARD_OUT(7,"标准出货","BZCH",""),
    MATERIAL_OUT(8,"材料出货单","CRKD",""),
    MISC_OUT(9,"杂发单","ZFCK",""),
    ADJUST_OUT(10,"调出单","DCCK",""),
    BAD_OUT(11,"不良品出货单","","");

    private final int value;
    private final String desc;
    private final String preffix;
    private final String recive;

    DocType(int status,String desc,String preffix,String recive){
        this.value = status;
        this.desc = desc ;
        this.preffix=preffix;
        this.recive=recive;
    }

    public static String getRecive(int status) {
        for (DocType c : DocType.values()) {
            if (c.getStatus() == status) {
                return c.recive;
            }
        }
        return null;
    }

    public int getStatus() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getPreffix(int status) {
        for (DocType c : DocType.values()) {
            if (c.getStatus() == status) {
                return c.preffix;
            }
        }
        return null;
    }


}
