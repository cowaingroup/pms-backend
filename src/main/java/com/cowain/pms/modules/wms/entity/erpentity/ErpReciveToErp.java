package com.cowain.pms.modules.wms.entity.erpentity;

import java.util.List;

public class ErpReciveToErp {
    private ErpCgReciveEntity head;

    private List<ErpCgReciveDetailEntity> detail;

    public ErpCgReciveEntity getHead() {
        return head;
    }

    public void setHead(ErpCgReciveEntity head) {
        this.head = head;
    }

    public List<ErpCgReciveDetailEntity> getDetail() {
        return detail;
    }

    public void setDetail(List<ErpCgReciveDetailEntity> detail) {
        this.detail = detail;
    }
}
