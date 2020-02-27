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
 * @date 2019-10-26 09:24:04
 */
@TableName("wms_item_store")
public class WmsItemStoreEntity implements Serializable {
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
	private String itemCode;
	/**
	 * 
	 */
	private String projectId;
	/**
	 * 
	 */
	private Integer itemNum;
	/**
	 * 
	 */
	private Integer itemLock;
	/**
	 * 
	 */
	private Integer itemLeft;

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
	public void setItemLock(Integer itemLock) {
		this.itemLock = itemLock;
	}
	/**
	 * 获取：
	 */
	public Integer getItemLock() {
		return itemLock;
	}
	/**
	 * 设置：
	 */
	public void setItemLeft(Integer itemLeft) {
		this.itemLeft = itemLeft;
	}
	/**
	 * 获取：
	 */
	public Integer getItemLeft() {
		return itemLeft;
	}
}
