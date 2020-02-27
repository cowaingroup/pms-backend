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
@TableName("wms_out_log")
public class WmsOulogEntity implements Serializable {
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
	 * 1创建 2分配 3拣货 4 复核 5 发运
	 */
	private Integer actType;
	/**
	 * 
	 */
	private Date actTime;
	/**
	 * 
	 */
	private String userId;
	/**
	 * 
	 */
	private String wmsDocNo;
	/**
	 * 
	 */
	private String erpDocNo;

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
	 * 设置：1创建 2分配 3拣货 4 复核 5 发运
	 */
	public void setActType(Integer actType) {
		this.actType = actType;
	}
	/**
	 * 获取：1创建 2分配 3拣货 4 复核 5 发运
	 */
	public Integer getActType() {
		return actType;
	}
	/**
	 * 设置：
	 */
	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}
	/**
	 * 获取：
	 */
	public Date getActTime() {
		return actTime;
	}
	/**
	 * 设置：
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：
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
}
