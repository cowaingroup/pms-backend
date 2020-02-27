package com.cowain.pms.modules.wms.entity.outerentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 形态转换表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-05 16:23:36
 */
@TableName("wms_change")
public class WmsChangeEntity implements Serializable {
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
	 * 仓库名称
	 */
	private String areaName;
	/**
	 * erp 单号
	 */
	private String erpDocNo;
	/**
	 * 仓库编码
	 */
	private String areaCode;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * erp 状态 1未回传  2已回传
	 */
	private Integer erpStatus;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 操作人员
	 */
	private String userName;

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
	 * 设置：仓库名称
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * 获取：仓库名称
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * 设置：erp 单号
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：erp 单号
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：仓库编码
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：仓库编码
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：erp 状态 1未回传  2已回传
	 */
	public void setErpStatus(Integer erpStatus) {
		this.erpStatus = erpStatus;
	}
	/**
	 * 获取：erp 状态 1未回传  2已回传
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
	 * 设置：操作人员
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：操作人员
	 */
	public String getUserName() {
		return userName;
	}
}
