package com.cowain.pms.modules.wms.entity.erpentity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 入库表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
public class WmsInDocFromErp implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    private WmsInDocEntity head;

    private List<WmsInDocDetailEntity> detail;

	public WmsInDocEntity getHead() {
		return head;
	}

	public void setHead(WmsInDocEntity head) {
		this.head = head;
	}

	public List<WmsInDocDetailEntity> getDetail() {
		return detail;
	}

	public void setDetail(List<WmsInDocDetailEntity> detail) {
		this.detail = detail;
	}
}
