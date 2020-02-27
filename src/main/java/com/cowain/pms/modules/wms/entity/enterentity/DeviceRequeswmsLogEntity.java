package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备进入wms的日志信息
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
@TableName("device_request_wms_log")
public class DeviceRequeswmsLogEntity implements Serializable {
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
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 进入wms渠道
	 */
	private String channel;
	/**
	 * 设备型号
	 */
	private String deviceType;
	/**
	 * 设备编号
	 */
	private String deviceNo;
	/**
	 * 设备ip地址
	 */
	private String ipAddress;
	/**
	 * 请求json数据
	 */
	private String requestJson;

	/**
	 * 设备授权code
	 */
	private String authCode;
	/**
	 * 操作人员id
	 */
	private Integer userId;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 料号数量
	 */
	private Integer itemNum;
	/**
	 * 料号编码
	 */
	private String itemCode;
	/**
	 * 料号状态  1 能收 2 不能收
	 */
	private Integer itemStatus;
	/**
	 * 业务类型
	 */
	private Integer bizType;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：进入wms渠道
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}
	/**
	 * 获取：进入wms渠道
	 */
	public String getChannel() {
		return channel;
	}
	/**
	 * 设置：设备型号
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	/**
	 * 获取：设备型号
	 */
	public String getDeviceType() {
		return deviceType;
	}
	/**
	 * 设置：设备编号
	 */
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	/**
	 * 获取：设备编号
	 */
	public String getDeviceNo() {
		return deviceNo;
	}
	/**
	 * 设置：设备ip地址
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * 获取：设备ip地址
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * 设置：请求json数据
	 */
	public void setRequestJson(String requestJson) {
		this.requestJson = requestJson;
	}
	/**
	 * 获取：请求json数据
	 */
	public String getRequestJson() {
		return requestJson;
	}

	/**
	 * 设置：设备授权code
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	/**
	 * 获取：设备授权code
	 */
	public String getAuthCode() {
		return authCode;
	}
	/**
	 * 设置：操作人员id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：操作人员id
	 */
	public Integer getUserId() {
		return userId;
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
	 * 设置：料号数量
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：料号数量
	 */
	public Integer getItemNum() {
		return itemNum;
	}
	/**
	 * 设置：料号编码
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：料号编码
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：料号状态  1 能收 2 不能收
	 */

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * 设置：业务类型
	 */
	public void setBizType(Integer bizType) {
		this.bizType = bizType;
	}
	/**
	 * 获取：业务类型
	 */
	public Integer getBizType() {
		return bizType;
	}
}
