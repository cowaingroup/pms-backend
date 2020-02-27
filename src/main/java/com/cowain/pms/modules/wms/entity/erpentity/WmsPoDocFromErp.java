package com.cowain.pms.modules.wms.entity.erpentity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cowain.pms.modules.wms.entity.enterentity.WmsPoDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsPoEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 入库表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
public class WmsPoDocFromErp implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    private WmsPoEntity head;

    private List<WmsPoDetailEntity> detail;

	public WmsPoEntity getHead() {
		return head;
	}

	public void setHead(WmsPoEntity head) {
		this.head = head;
	}

	public List<WmsPoDetailEntity> getDetail() {
		return detail;
	}

	public void setDetail(List<WmsPoDetailEntity> detail) {
		this.detail = detail;
	}
}
