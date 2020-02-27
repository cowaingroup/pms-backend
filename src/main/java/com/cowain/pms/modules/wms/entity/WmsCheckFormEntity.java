package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 盘点清单
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-19 15:39:29
 */

@TableName("wms_check_form")
public class WmsCheckFormEntity implements Serializable {
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
	 * erp盘点单
	 */
	private String erpCheckNo;
	/**
	 * wms盘点单
	 */
	private String wmsCheckNo;
	/**
	 * 任务状态
	 */
	private String status;
	/**
	 * 生成时间
	 */
	private Date createTime;
	/**
	 * 制单人员
	 */
	private String createUser;
	/**
	 * 备注
	 */
	private String remark;

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
	 * 设置：erp盘点单
	 */
	public void setErpCheckNo(String erpCheckNo) {
		this.erpCheckNo = erpCheckNo;
	}
	/**
	 * 获取：erp盘点单
	 */
	public String getErpCheckNo() {
		return erpCheckNo;
	}
	/**
	 * 设置：wms盘点单
	 */
	public void setWmsCheckNo(String wmsCheckNo) {
		this.wmsCheckNo = wmsCheckNo;
	}
	/**
	 * 获取：wms盘点单
	 */
	public String getWmsCheckNo() {
		return wmsCheckNo;
	}
	/**
	 * 设置：任务状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：任务状态
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：生成时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：生成时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：制单人员
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：制单人员
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}
