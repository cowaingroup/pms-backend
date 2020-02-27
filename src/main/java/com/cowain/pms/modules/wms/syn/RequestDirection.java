package com.cowain.pms.modules.wms.syn;

/**
 * 仓储状态
 */
public  enum RequestDirection {
    REQUSET_WMS(1,"请求WMS"),
    WMS_RESPONSE(2,"WMS响应"),
    WMS_REQUSET(3,"WMS请求"),
    RESPONSE_WMS(4,"响应WMS"),;

    private final int status;
    private final String desc;

    RequestDirection(int status , String desc ){
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
