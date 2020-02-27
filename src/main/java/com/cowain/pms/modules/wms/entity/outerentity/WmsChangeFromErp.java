package com.cowain.pms.modules.wms.entity.outerentity;

import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * 入库表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
public class WmsChangeFromErp implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    private WmsChangeEntity head;

    private List<WmsChangeDetailEntity> detail;


    public List<WmsChangeDetailEntity> getDetail() {
        return detail;
    }

    public void setDetail(List<WmsChangeDetailEntity> detail) {
        this.detail = detail;
    }

    public WmsChangeEntity getHead() {
        return head;
    }

    public void setHead(WmsChangeEntity head) {
        this.head = head;
    }
}
