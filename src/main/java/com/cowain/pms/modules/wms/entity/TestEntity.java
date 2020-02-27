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
 * @date 2019-11-15 11:17:40
 */
@TableName("test")
public class TestEntity implements Serializable {
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

	private Integer lineNo;
	/**
	 * 
	 */
	private String itemSn;

	private int itemStatus;
	/**
	 * 
	 */
	private String itemCode;
	/**
	 * 
	 */
	private Integer itemNum;
	/**
	 * 
	 */
	private String itemUnit;
	/**
	 * 
	 */
	private String itemName;
	/**
	 * 
	 */
	private String projectId;
	/**
	 * 
	 */
	private String areaCode;
	/**
	 * 
	 */
	private Integer preNum;
	/**
	 * 
	 */
	private String poCode;

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public int getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(int itemStatus) {
		this.itemStatus = itemStatus;
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
	 * 设置：
	 */
	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}
	/**
	 * 获取：
	 */
	public String getItemSn() {
		return itemSn;
	}
	/**
	 * 设置：
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：
	 */
	public String getItemCode() {
		return itemCode;
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
	 * 设置：
	 */
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	/**
	 * 获取：
	 */
	public String getItemUnit() {
		return itemUnit;
	}
	/**
	 * 设置：
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * 获取：
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * 设置：
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：
	 */
	public void setPreNum(Integer preNum) {
		this.preNum = preNum;
	}
	/**
	 * 获取：
	 */
	public Integer getPreNum() {
		return preNum;
	}
	/**
	 * 设置：
	 */
	public void setPoCode(String poCode) {
		this.poCode = poCode;
	}
	/**
	 * 获取：
	 */
	public String getPoCode() {
		return poCode;
	}
}
