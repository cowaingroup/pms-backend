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
 * @date 2019-10-14 09:05:19
 */
@TableName("wms_merge_detail")
public class WmsMergeDetailEntity implements Serializable {
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
	private Integer mergeId;
	/**
	 * 入库单号
	 */
	private String wmsDocNo;
	/**
	 * 
	 */
	private String erpDocNo;
	/**
	 * 
	 */
	private Integer docType;
	/**
	 * 
	 */
	private Integer wmsStatus;

	private Integer erpStatus;

	private Date insertTime;

	private String globalId;

	private String supplyName;

	public String getSupplyName() {
		return supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

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

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
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
	public void setMergeId(Integer mergeId) {
		this.mergeId = mergeId;
	}
	/**
	 * 获取：
	 */
	public Integer getMergeId() {
		return mergeId;
	}
	/**
	 * 设置：入库单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：入库单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：
	 */
	public Integer getDocType() {
		return docType;
	}

}
