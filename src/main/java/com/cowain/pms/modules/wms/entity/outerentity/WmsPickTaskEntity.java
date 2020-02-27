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
 * @date 2019-10-23 14:40:36
 */
@TableName("wms_pick_task")
public class WmsPickTaskEntity implements Serializable {
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

	private Integer outId;
	/**
	 *
	 */
	private String taskNo;

	private String globalId;

	/**
	 *
	 */
	private Integer docType;
	/**
	 * 1待拣货 2部分拣货 3拣货完成 4部分复核 5复核完成 6已取消
	 */
	private Integer wmsStatus;

	private Integer wcsStatus;
	/**
	 *
	 */
	private Date createTime;

	private  String wmsDocNo;

	private  String erpDocNo;

	private String bcNo;

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public Integer getWcsStatus() {
		return wcsStatus;
	}

	public void setWcsStatus(Integer wcsStatus) {
		this.wcsStatus = wcsStatus;
	}

	public String getBcNo() {
		return bcNo;
	}

	public void setBcNo(String bcNo) {
		this.bcNo = bcNo;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public Integer getOutId() {
		return outId;
	}

	public void setOutId(Integer outId) {
		this.outId = outId;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}

	public String getErpDocNo() {
		return erpDocNo;
	}

	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
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
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	/**
	 * 获取：
	 */
	public String getTaskNo() {
		return taskNo;
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
	/**
	 * 设置：1待拣货 2部分拣货 3拣货完成 4部分复核 5复核完成 6已取消
	 */
	public void setWmsStatus(Integer wmsStatus) {
		this.wmsStatus = wmsStatus;
	}
	/**
	 * 获取：1待拣货 2部分拣货 3拣货完成 4部分复核 5复核完成 6已取消
	 */
	public Integer getWmsStatus() {
		return wmsStatus;
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
}
