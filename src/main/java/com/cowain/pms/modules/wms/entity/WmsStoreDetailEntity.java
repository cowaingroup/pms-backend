package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 库存明细
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-10 10:54:54
 */
@TableName("wms_store_detail")
public class WmsStoreDetailEntity implements Serializable {
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
	 * 料号
	 */
	private String itemCode;

	private String itemSn;
	/**
	 * 名称
	 */
	private String itemName;
	/**
	 * 规格
	 */
	private String itemSpec;
	/**
	 * 描述
	 */
	private String itemDesc;
	/**
	 * 单位
	 */
	private String itemUnitCode;
	/**
	 * 库存数量
	 */
	private Integer itemNum;

	private Integer lockNum;
//	/**
//	 * 仓库
//	 */
//	private String houseCode;
//	/**
//	 * 库区
//	 */
//	private String positionCode;
	/**
	 * 库位
	 */
	private String boxCode;

	private String projectId;

	private String projectName;

	private Date createTime;

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public Integer getLockNum() {
		return lockNum;
	}

	public void setLockNum(Integer lockNum) {
		this.lockNum = lockNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

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
	 * 设置：料号
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：料号
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：规格
	 */
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}
	/**
	 * 获取：规格
	 */
	public String getItemSpec() {
		return itemSpec;
	}
	/**
	 * 设置：描述
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 获取：描述
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 设置：单位
	 */
	public void setItemUnitCode(String itemUnitCode) {
		this.itemUnitCode = itemUnitCode;
	}
	/**
	 * 获取：单位
	 */
	public String getItemUnitCode() {
		return itemUnitCode;
	}
	/**
	 * 设置：库存数量
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：库存数量
	 */
	public Integer getItemNum() {
		return itemNum;
	}
//	/**
//	 * 设置：仓库
//	 */
//	public void setHouseCode(String houseCode) {
//		this.houseCode = houseCode;
//	}
//	/**
//	 * 获取：仓库
//	 */
//	public String getHouseCode() {
//		return houseCode;
//	}
//	/**
//	 * 设置：库区
//	 */
//	public void setPositionCode(String positionCode) {
//		this.positionCode = positionCode;
//	}
//	/**
//	 * 获取：库区
//	 */
//	public String getPositionCode() {
//		return positionCode;
//	}
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

	public WmsStoreDetailEntity(String itemCode, String itemName, String itemUnitCode, Integer itemNum, String boxCode,String projectId,String projectName,int lockNum,String itemSn) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemUnitCode = itemUnitCode;
		this.itemNum = itemNum;
		this.boxCode = boxCode;
		this.projectId=projectId;
		this.projectName=projectName;
		this.lockNum=lockNum;
		this.itemSn=itemSn;
	}

	public WmsStoreDetailEntity() {
	}
}
