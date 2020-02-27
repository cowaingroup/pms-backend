package com.cowain.pms.modules.wms.entity.erpentity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsErpMainEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsErpOuinfoEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 入库表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
public class WmsOutDocFromErp implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    private WmsErpMainEntity head;

    private List<WmsErpOuinfoEntity> detail;

	public WmsErpMainEntity getHead() {
		return head;
	}

	public void setHead(WmsErpMainEntity head) {
		this.head = head;
	}

	public List<WmsErpOuinfoEntity> getDetail() {
		return detail;
	}

	public void setDetail(List<WmsErpOuinfoEntity> detail) {
		this.detail = detail;
	}
}
