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
 * @date 2019-09-29 16:37:33
 */
@TableName("wms_request_erp_log")
public class WmsRequeserpLogEntity implements Serializable {
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
	 * erp地址
	 */
	private String erpUrl;
	/**
	 * 请求数据
	 */
	private String requestJson;
	/**
	 * 请求类型 get \post
	 */
	private String requestMethod;
	/**
	 * 授权code
	 */
	private String authCode;
	/**
	 * 授权秘钥
	 */
	private String authSecret;
	/**
	 * 返回来的json数据
	 */
	private String responseJson;
	/**
	 * 状态 1 已经发送 2.发送成功  3.未接收到数据 4.接收成功
	 */
	private Integer status;
	/**
	 * 请求时间
	 */
	private Date requestTime;
	/**
	 * 数据返回时间
	 */
	private Date responseTime;
	/**
	 * 业务类型 
	 */
	private Integer bizType;

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
	 * 设置：erp地址
	 */
	public void setErpUrl(String erpUrl) {
		this.erpUrl = erpUrl;
	}
	/**
	 * 获取：erp地址
	 */
	public String getErpUrl() {
		return erpUrl;
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
	 * 设置：请求类型 get \post
	 */
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	/**
	 * 获取：请求类型 get \post
	 */
	public String getRequestMethod() {
		return requestMethod;
	}
	/**
	 * 设置：授权code
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	/**
	 * 获取：授权code
	 */
	public String getAuthCode() {
		return authCode;
	}
	/**
	 * 设置：授权秘钥
	 */
	public void setAuthSecret(String authSecret) {
		this.authSecret = authSecret;
	}
	/**
	 * 获取：授权秘钥
	 */
	public String getAuthSecret() {
		return authSecret;
	}
	/**
	 * 设置：返回来的json数据
	 */
	public void setResponseJson(String responseJson) {
		this.responseJson = responseJson;
	}
	/**
	 * 获取：返回来的json数据
	 */
	public String getResponseJson() {
		return responseJson;
	}
	/**
	 * 设置：状态 1 已经发送 2.发送成功  3.未接收到数据 4.接收成功
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 1 已经发送 2.发送成功  3.未接收到数据 4.接收成功
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：请求时间
	 */
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	/**
	 * 获取：请求时间
	 */
	public Date getRequestTime() {
		return requestTime;
	}
	/**
	 * 设置：数据返回时间
	 */
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	/**
	 * 获取：数据返回时间
	 */
	public Date getResponseTime() {
		return responseTime;
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
