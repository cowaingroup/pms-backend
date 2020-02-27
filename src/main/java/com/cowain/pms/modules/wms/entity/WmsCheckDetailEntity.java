package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 盘点清单明细
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-19 15:39:29
 */
@TableName("wms_check_detail")
public class WmsCheckDetailEntity implements Serializable {
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
	 * 物料编号
	 */
	private String itemCode;
	/**
	 * 物料编号
	 */
	private String itemName;
	/**
	 * 库位
	 */
	private String boxCode;
	/**
	 * 盘点数量
	 */
	private Integer checkNum;
	/**
	 * 库存数量
	 */
	private Integer storeNum;
	/**
	 * 库存损益
	 */
	private Integer storeLoss;
	/**
	 * 盘点时间
	 */
	private Date checkTime;
	/**
	 * 盘点人员
	 */
	private String checkUser;
	/**
	 * 父 id
	 */
	private Integer parentId;
	/**
	 * 调整状态
	 */
	private String  adjustStatus;

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
	 * 设置：物料编号
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：物料编号
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：库位
	 */
	public void setBoxCode(String boxCode) {
		this.boxCode = boxCode;
	}
	/**
	 * 获取：库位
	 */
	public String getBoxCode() {
		return boxCode;
	}
	/**
	 * 设置：盘点数量
	 */
	public void setCheckNum(Integer checkNum) {
		this.checkNum = checkNum;
	}
	/**
	 * 获取：盘点数量
	 */
	public Integer getCheckNum() {
		return checkNum;
	}
	/**
	 * 设置：库存数量
	 */
	public void setStoreNum(Integer storeNum) {
		this.storeNum = storeNum;
	}
	/**
	 * 获取：库存数量
	 */
	public Integer getStoreNum() {
		return storeNum;
	}
	/**
	 * 设置：库存损益
	 */
	public void setStoreLoss(Integer storeLoss) {
		this.storeLoss = storeLoss;
	}
	/**
	 * 获取：库存损益
	 */
	public Integer getStoreLoss() {
		return storeLoss;
	}
	/**
	 * 设置：盘点时间
	 */
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	/**
	 * 获取：盘点时间
	 */
	public Date getCheckTime() {
		return checkTime;
	}
	/**
	 * 设置：盘点人员
	 */
	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}
	/**
	 * 获取：盘点人员
	 */
	public String getCheckUser() {
		return checkUser;
	}
	/**
	 * 设置：父 id
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父 id
	 */
	public Integer getParentId() {
		return parentId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getAdjustStatus() {
		return adjustStatus;
	}

	public void setAdjustStatus(String adjustStatus) {
		this.adjustStatus = adjustStatus;
	}
}
