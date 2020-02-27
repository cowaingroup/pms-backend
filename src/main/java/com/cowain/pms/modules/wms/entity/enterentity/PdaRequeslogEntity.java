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
 * @date 2019-11-28 14:00:53
 */
@TableName("pda_request_log")
public class PdaRequeslogEntity implements Serializable {
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
	 * ip address
	 */
	private String ipAddress;
	/**
	 * 请求数据
	 */
	private String requestJson;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 请求url
	 */
	private String requestUrl;
	/**
	 * 请求方法 get 或 post
	 */
	private String requestMethod;
	/**
	 * 1 pda 请求 wms 2 ，wms 发送给 pda
	 */
	private Integer direction;

	private String deviceCode;

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
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
	 * 设置：ip address
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * 获取：ip address
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * 设置：请求数据
	 */
	public void setRequestJson(String requestJson) {
		this.requestJson = requestJson;
	}
	/**
	 * 获取：请求数据
	 */
	public String getRequestJson() {
		return requestJson;
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
	 * 设置：请求url
	 */
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	/**
	 * 获取：请求url
	 */
	public String getRequestUrl() {
		return requestUrl;
	}
	/**
	 * 设置：请求方法 get 或 post
	 */
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	/**
	 * 获取：请求方法 get 或 post
	 */
	public String getRequestMethod() {
		return requestMethod;
	}
	/**
	 * 设置：1 pda 请求 wms 2 ，wms 发送给 pda
	 */
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	/**
	 * 获取：1 pda 请求 wms 2 ，wms 发送给 pda
	 */
	public Integer getDirection() {
		return direction;
	}
}
