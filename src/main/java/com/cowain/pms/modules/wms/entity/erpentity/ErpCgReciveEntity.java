package com.cowain.pms.modules.wms.entity.erpentity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * erp采购收货字段
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
public class ErpCgReciveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String t;

	private String cbillcode;//收货单号

	private Date ddate;//收货时间



	public String getCbillcode() {
		return cbillcode;
	}

	public void setCbillcode(String cbillcode) {
		this.cbillcode = cbillcode;
	}

	public Date getDdate() {
		return ddate;
	}

	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}


}
