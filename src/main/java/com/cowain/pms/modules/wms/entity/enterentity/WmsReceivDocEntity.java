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
@TableName("wms_receiv_doc")
public class WmsReceivDocEntity implements Serializable {

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
	 * 全局id
	 */
	private String globalId;
	/**
	 * wms 收单号
	 */
	private String wmsDocNo;
	/**
	 * erp 收单号
	 */
	private String erpDocNo;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 单据类型
	 */
	private Integer docType;
	/**
	 * 1 创建 2 待生成入库单 3 已生成入库单
	 */
	private Integer wmsStatus;
	private Integer erpStatus;

	private String userId;

	private String supplyName;

	private Integer pdaStatus;

	private Integer ownerId;

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getPdaStatus() {
		return pdaStatus;
	}

	public void setPdaStatus(Integer pdaStatus) {
		this.pdaStatus = pdaStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSupplyName() {
		return supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
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
	 * 设置：全局id
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	/**
	 * 获取：全局id
	 */
	public String getGlobalId() {
		return globalId;
	}
	/**
	 * 设置：wms 收单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms 收单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：erp 收单号
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：erp 收单号
	 */
	public String getErpDocNo() {
		return erpDocNo;
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
	 * 设置：单据类型
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：单据类型
	 */
	public Integer getDocType() {
		return docType;
	}
	/**
	 * 设置：1 创建 2 待生成入库单 3 已生成入库单
	 */
	public Integer getWmsStatus() {
		return wmsStatus;
	}

	public void setWmsStatus(Integer wmsStatus) {
		this.wmsStatus = wmsStatus;
	}

	public Integer getErpStatus() {
		return erpStatus;
	}

	public void setErpStatus(Integer erpStatus) {
		this.erpStatus = erpStatus;
	}
}
