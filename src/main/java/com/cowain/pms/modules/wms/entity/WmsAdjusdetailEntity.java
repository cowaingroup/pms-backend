package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-26 14:00:39
 */
@TableName("wms_adjust_detail")
public class WmsAdjusdetailEntity implements Serializable {
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
	 * 父id
	 */
	private Integer parentId;
	/**
	 * 库存数量
	 */
	private Integer storeNum;
	/**
	 * 盘点数量
	 */
	private Integer checkNum;
	/**
	 * 库存损益
	 */
	private Integer storeLoss;
	/**
	 * 库位
	 */
	private String boxCode;
	/**
	 * 物料编号
	 */
	private String itemCode;
	/**
	 * 物料名称
	 */
	private String itemName;
	/**
	 * 入库时间
	 */
	private Date createTime;
	private String isuse;

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
	 * 设置：父id
	 */


	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * 获取：父id
	 */
	public Integer getParentId() {
		return parentId;
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
	 * 设置：物料名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：物料名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：入库时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：入库时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	public String getIsuse() {
		return isuse;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
	}
}
