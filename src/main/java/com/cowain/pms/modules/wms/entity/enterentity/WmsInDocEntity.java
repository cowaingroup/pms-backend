package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.Date;

/**
 * 入库表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
@TableName("wms_in_doc")
public class WmsInDocEntity implements Serializable {
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
	 * 全局唯一id
	 */
	private String globalId;
	/**
	 * wms 入库单号
	 */
	private String wmsDocNo;
	/**
	 * erp 入库单号
	 */
	private String erpDocNo;
	/**
	 * wms 状态 1.创建 1 待质检 3.已经质检 4.已经入库 5.已确认 6 已经关闭
	 */
	private Integer wmsStatus;
	/**
	 * erp 状态 1.开立 2.已经审核 3.已关闭
	 */
	private Integer erpStatus;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 1.标准收货 2 杂收 3.机加工收货 4.材料入库 5 销售退回
	 */
	private Integer docType;
	/**
	 * 入库单的 对应的收货单来源
	 */
	private Integer sourceReceivDocNo;

	private Integer wcsStatus;

	private  String wmsReceivNo;

	private String supplyName;

	public String getSupplyName() {
		return supplyName;
	}

	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}

	public Integer getWcsStatus() {
		return wcsStatus;
	}

	public void setWcsStatus(Integer wcsStatus) {
		this.wcsStatus = wcsStatus;
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
	 * 设置：wms 入库单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms 入库单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：erp 入库单号
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：erp 入库单号
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：wms 状态 1.创建 1 待质检 3.已经质检 4.已经入库 5.已确认 6 已经关闭
	 */
	public void setWmsStatus(Integer wmsStatus) {
		this.wmsStatus = wmsStatus;
	}
	/**
	 * 获取：wms 状态 1.创建 1 待质检 3.已经质检 4.已经入库 5.已确认 6 已经关闭
	 */
	public Integer getWmsStatus() {
		return wmsStatus;
	}
	/**
	 * 设置：erp 状态 1.开立 2.已经审核 3.已关闭
	 */
	public void setErpStatus(Integer erpStatus) {
		this.erpStatus = erpStatus;
	}
	/**
	 * 获取：erp 状态 1.开立 2.已经审核 3.已关闭
	 */
	public Integer getErpStatus() {
		return erpStatus;
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
	 * 设置：1.标准收货 2 杂收 3.机加工收货 4.材料入库 5 销售退回
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：1.标准收货 2 杂收 3.机加工收货 4.材料入库 5 销售退回
	 */
	public Integer getDocType() {
		return docType;
	}
	/**
	 * 设置：入库单的 对应的收货单来源
	 */
	public void setSourceReceivDocNo(Integer sourceReceivDocNo) {
		this.sourceReceivDocNo = sourceReceivDocNo;
	}
	/**
	 * 获取：入库单的 对应的收货单来源
	 */
	public Integer getSourceReceivDocNo() {
		return sourceReceivDocNo;
	}

	public String getWmsReceivNo() {
		return wmsReceivNo;
	}

	public void setWmsReceivNo(String wmsReceivNo) {
		this.wmsReceivNo = wmsReceivNo;
	}
}
