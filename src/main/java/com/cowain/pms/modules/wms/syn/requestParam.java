package com.cowain.pms.modules.wms.syn;

/**
 * 请求参数
 */
public class requestParam {
    public  static final String ERP_REQUEST_URL="http://localhost:8081/wcs/test";//请求ERP路径

    public  static final String WCS_REQUEST_URL="http://192.168.188.200:8001/WCS/HTTPPOST";//下发入库单wcs路径

    public  static final String WCS_OUT_REQUEST_URL="http://192.168.188.5:8001/WCS/HTTPPOST";//下发出库单wcs路径

    public  static final String WCS_CANCEL_URL="";//WCS取消入库单路径

    public  static final String WCS_TASKCANCEL_URL="";//WCS取消拣货路径
}
