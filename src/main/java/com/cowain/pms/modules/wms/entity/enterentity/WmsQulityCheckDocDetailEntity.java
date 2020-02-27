package com.cowain.pms.modules.wms.entity.enterentity;

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
 * @date 2019-09-29 16:37:21
 */
@TableName("wms_qulity_check_doc_detail")
public class WmsQulityCheckDocDetailEntity implements Serializable {
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
	 * 质检主表id
	 */
	private Integer checkId;
	/**
	 * 料号id
	 */
	private String itemId;
	/**
	 * 料号编码
	 */
	private String itemCode;

	private String itemSn;
	/**
	 * 全局唯一id
	 */
	private String globalId;
	/**
	 * 料品名称
	 */
	private String itemName;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 1 合格 2 不合格 3 需要重新检验
	 */
	private Integer status;

	private Integer itemNum;
	@TableField(exist = false)
	private String wmsDocNo;

	private String userId;

	private String positionCode;

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getItemNum() {
		return itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
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
	 * 设置：质检主表id
	 */
	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}
	/**
	 * 获取：质检主表id
	 */
	public Integer getCheckId() {
		return checkId;
	}
	/**
	 * 设置：料号id
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：料号id
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * 设置：料号编码
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：料号编码
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：全局唯一id
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	/**
	 * 获取：全局唯一id
	 */
	public String getGlobalId() {
		return globalId;
	}
	/**
	 * 设置：料品名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：料品名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：插入时间
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	/**
	 * 获取：插入时间
	 */
	public Date getInsertTime() {
		return insertTime;
	}
	/**
	 * 设置：1 合格 2 不合格 3 需要重新检验
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：1 合格 2 不合格 3 需要重新检验
	 */
	public Integer getStatus() {
		return status;
	}

	public WmsQulityCheckDocDetailEntity(Integer checkId, String itemId, String itemCode, String globalId, String itemName, Date insertTime) {
		this.checkId = checkId;
		this.itemId = itemId;
		this.itemCode = itemCode;
		this.globalId = globalId;
		this.itemName = itemName;
		this.insertTime = insertTime;
	}

	public WmsQulityCheckDocDetailEntity() {
	}
}
