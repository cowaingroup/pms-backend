package com.cowain.pms.modules.wms.entity.outerentity;

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
 * @date 2019-10-18 13:32:41
 */
@TableName("wms_erp_main")
public class WmsErpMainEntity implements Serializable {
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
	 * erp 出货单号
	 */
	private String erpDocNo;
	/**
	 * wms 出货单号
	 */
	private String wmsDocNo;
	/**
	 * 单据类型  1 标准出货 2 杂发 3 材料出库 4 机加工出库 
	 */
	private Integer docType;
	/**
	 * 客户名称
	 */

	private String custName;
	/**
	 * 送货地址
	 */
	private String addressName;
	/**
	 * 邮政编码
	 */
	private String postCode;
	/**
	 * 收货人
	 */
	private String receiveName;
	/**
	 * 电话号码
	 */
	private String phoneName;
	/**
	 * 1 创建状态 2 部分出仓 3 全部出仓 4 已复核 5 已发运 6 关闭
	 */
	private Integer wmsStatus;
	/**
	 * 1 已回传 2 未回传
	 */
	private Integer erpStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 任务包编号
	 */
	private String taskNo;
	/**
	 * 波次编号
	 */
	private String batchNo;

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
	 * 设置：erp 出货单号
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：erp 出货单号
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：wms 出货单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms 出货单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：单据类型  1 标准出货 2 杂发 3 材料出库 4 机加工出库 
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：单据类型  1 标准出货 2 杂发 3 材料出库 4 机加工出库 
	 */
	public Integer getDocType() {
		return docType;
	}
	/**
	 * 设置：客户名称
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * 获取：客户名称
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * 设置：送货地址
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	/**
	 * 获取：送货地址
	 */
	public String getAddressName() {
		return addressName;
	}
	/**
	 * 设置：邮政编码
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * 获取：邮政编码
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * 设置：收货人
	 */
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	/**
	 * 获取：收货人
	 */
	public String getReceiveName() {
		return receiveName;
	}
	/**
	 * 设置：电话号码
	 */
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	/**
	 * 获取：电话号码
	 */
	public String getPhoneName() {
		return phoneName;
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

	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：任务包编号
	 */
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	/**
	 * 获取：任务包编号
	 */
	public String getTaskNo() {
		return taskNo;
	}
	/**
	 * 设置：波次编号
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	/**
	 * 获取：波次编号
	 */
	public String getBatchNo() {
		return batchNo;
	}
}
