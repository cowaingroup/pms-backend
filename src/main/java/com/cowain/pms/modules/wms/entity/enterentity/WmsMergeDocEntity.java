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
@TableName("wms_merge_doc")
public class WmsMergeDocEntity implements Serializable {
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
	 * 汇总单号
	 */
	private String mergeNo;

	/**
	 * 预期总数量
	 */
	@TableField(exist = false)
	private Integer preSum;
	/**
	 * 已收数
	 */
	@TableField(exist = false)
	private Integer acceptSum;
	/**
	 * 未收数
	 */
	@TableField(exist = false)
	private Integer unceptSum;
	/**
	 * 单据类型
	 */
	private Integer docType;
	/**
	 * 生成时间
	 */
	private Date createTime;
	/**
	 * 1创建 2已下发 3已请求 
	 */
	private Integer status;

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
	 * 设置：汇总单号
	 */
	public void setMergeNo(String mergeNo) {
		this.mergeNo = mergeNo;
	}
	/**
	 * 获取：汇总单号
	 */
	public String getMergeNo() {
		return mergeNo;
	}
	/**
	 * 设置：预期总数量
	 */
	public void setPreSum(Integer preSum) {
		this.preSum = preSum;
	}
	/**
	 * 获取：预期总数量
	 */
	public Integer getPreSum() {
		return preSum;
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
	 * 设置：1创建 2已下发 3已请求 
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：1创建 2已下发 3已请求 
	 */
	public Integer getStatus() {
		return status;
	}

	public Integer getAcceptSum() {
		return acceptSum;
	}

	public void setAcceptSum(Integer acceptSum) {
		this.acceptSum = acceptSum;
	}

	public Integer getUnceptSum() {
		return unceptSum;
	}

	public void setUnceptSum(Integer unceptSum) {
		this.unceptSum = unceptSum;
	}
}
