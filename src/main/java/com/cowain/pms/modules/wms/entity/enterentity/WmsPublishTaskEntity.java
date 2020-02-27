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
 * @date 2019-11-21 09:12:24
 */
@TableName("wms_publish_task")
public class WmsPublishTaskEntity implements Serializable {
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
	 * 任务单号
	 */
	private String taskNo;

	private String globalId;
	/**
	 * wms单号
	 */
	private String wmsDocNo;
	/**
	 * erp单号
	 */
	private String erpDocNo;
	/**
	 * 消息ID
	 */
	private String messageId;
	/**
	 * 类型
	 */
	private int type;
	/**
	 * 表名
	 */
	private String tableName;
	/**
	 * 表单id
	 */
	private Integer tableId;
	/**
	 * 认领用户*
	 */
	private String claimUser;
	/**
	 * 状态
	 */
	private Integer status;

	private Date insertTime;

	public String getClaimUser() {
		return claimUser;
	}

	public void setClaimUser(String claimUser) {
		this.claimUser = claimUser;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
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
	 * 设置：任务单号
	 */
	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}
	/**
	 * 获取：任务单号
	 */
	public String getTaskNo() {
		return taskNo;
	}
	/**
	 * 设置：wms单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：erp单号
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：erp单号
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：消息ID
	 */
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * 设置：类型
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * 获取：类型
	 */
	public int getType() {
		return type;
	}
	/**
	 * 设置：表名
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * 获取：表名
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * 设置：表单id
	 */
	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}
	/**
	 * 获取：表单id
	 */
	public Integer getTableId() {
		return tableId;
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
}
