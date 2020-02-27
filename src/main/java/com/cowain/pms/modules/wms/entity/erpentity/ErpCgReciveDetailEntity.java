package com.cowain.pms.modules.wms.entity.erpentity;

import java.util.Date;

public class ErpCgReciveDetailEntity {
    private static final long serialVersionUID = 1L;

    private String t;

    private Integer polineno;//采购单行号

    private Integer qty;//入库数量

    private String whcode;//货区

    private String pocode;//货位

    private String procode;//项目编码

    private String pono;//采购单号

    private Integer status;//质检状态

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ErpCgReciveDetailEntity() {
    }

    public ErpCgReciveDetailEntity(Integer polineno, Integer qty, String whcode, String pocode, String procode, String pono,int status) {
        this.polineno = polineno;
        this.qty = qty;
        this.whcode = whcode;
        this.pocode = pocode;
        this.procode = procode;
        this.pono = pono;
        this.status=status;
    }

    public String getPono() {
        return pono;
    }

    public void setPono(String pono) {
        this.pono = pono;
    }

    public Integer getPolineno() {
        return polineno;
    }

    public void setPolineno(Integer polineno) {
        this.polineno = polineno;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getWhcode() {
        return whcode;
    }

    public void setWhcode(String whcode) {
        this.whcode = whcode;
    }

    public String getPocode() {
        return pocode;
    }

    public void setPocode(String pocode) {
        this.pocode = pocode;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode;
    }
}
