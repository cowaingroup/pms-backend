package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
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
@TableName("t_warehouse_iteminfo")
public class WarehouseIteminfoEntity implements Serializable {
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
	 * 
	 */
	private Integer lotId;
	/**
	 * 
	 */
	private String rfidCode;
	/**
	 * 
	 */
	private Integer warehouseLocationId;
	/**
	 * 
	 */
	private Integer itemId;
	/**
	 * 
	 */
	private Integer itemNum;
	/**
	 * 1 正在入库 2 入库完成 3 正在出库 4 出库完成
	 */
	private Integer type;
	/**
	 * 
	 */
	private Date insertTime;
	/**
	 * 
	 */
	private Integer insertUser;

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
	 * 设置：
	 */
	public void setLotId(Integer lotId) {
		this.lotId = lotId;
	}
	/**
	 * 获取：
	 */
	public Integer getLotId() {
		return lotId;
	}
	/**
	 * 设置：
	 */
	public void setRfidCode(String rfidCode) {
		this.rfidCode = rfidCode;
	}
	/**
	 * 获取：
	 */
	public String getRfidCode() {
		return rfidCode;
	}
	/**
	 * 设置：
	 */
	public void setWarehouseLocationId(Integer warehouseLocationId) {
		this.warehouseLocationId = warehouseLocationId;
	}
	/**
	 * 获取：
	 */
	public Integer getWarehouseLocationId() {
		return warehouseLocationId;
	}
	/**
	 * 设置：
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：
	 */
	public Integer getItemId() {
		return itemId;
	}
	/**
	 * 设置：
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：
	 */
	public Integer getItemNum() {
		return itemNum;
	}
	/**
	 * 设置：1 正在入库 2 入库完成 3 正在出库 4 出库完成
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：1 正在入库 2 入库完成 3 正在出库 4 出库完成
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	/**
	 * 获取：
	 */
	public Date getInsertTime() {
		return insertTime;
	}
	/**
	 * 设置：
	 */
	public void setInsertUser(Integer insertUser) {
		this.insertUser = insertUser;
	}
	/**
	 * 获取：
	 */
	public Integer getInsertUser() {
		return insertUser;
	}
}
