package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-17 17:34:04
 */
@TableName("t_bind_lot")
public class BindLotEntity implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    public String getT() {
        return t;
    }
	public void setT(String t){
        this.t = t;
	}
		/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 工单id
	 */
	private Integer lotId;


	private String  lotName;

	private String  productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLotName() {
		return lotName;
	}

	public void setLotName(String lotName) {
		this.lotName = lotName;
	}

	/**
	 * RFID 卡编号
	 */
	private String rfidCode;
	/**
	 * 1 绑定 2 解绑 3 入库 4 出库
	 */
	private Integer status;
	/**
	 * 绑定时间
	 */
	private Date insertTime;
	/**
	 * 绑定用户
	 */
	private String insertUser;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：工单id
	 */
	public void setLotId(Integer lotId) {
		this.lotId = lotId;
	}
	/**
	 * 获取：工单id
	 */
	public Integer getLotId() {
		return lotId;
	}
	/**
	 * 设置：RFID 卡编号
	 */
	public void setRfidCode(String rfidCode) {
		this.rfidCode = rfidCode;
	}
	/**
	 * 获取：RFID 卡编号
	 */
	public String getRfidCode() {
		return rfidCode;
	}
	/**
	 * 设置：1 绑定 2 解绑 3 入库 4 出库
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：1 绑定 2 解绑 3 入库 4 出库
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：绑定时间
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	/**
	 * 获取：绑定时间
	 */
	public Date getInsertTime() {
		return insertTime;
	}
	/**
	 * 设置：绑定用户
	 */
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}
	/**
	 * 获取：绑定用户
	 */
	public String getInsertUser() {
		return insertUser;
	}
}
