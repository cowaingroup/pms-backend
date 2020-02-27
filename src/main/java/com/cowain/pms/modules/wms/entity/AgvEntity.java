package com.cowain.pms.modules.wms.entity;

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
 * @date 2019-07-18 19:24:36
 */
@TableName("t_agv")
public class AgvEntity implements Serializable {
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
	 * agv 名称
	 */
	private String agvName;
	/**
	 * 型号
	 */
	private String agvModel;
	/**
	 * 厂家
	 */
	private String vendor;
	/**
	 * 通讯方式
	 */
	private Integer connectType;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * 端口
	 */
	private Integer port;
	/**
	 * 所属仓位
	 */
	private String location;

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
	 * 设置：agv 名称
	 */
	public void setAgvName(String agvName) {
		this.agvName = agvName;
	}
	/**
	 * 获取：agv 名称
	 */
	public String getAgvName() {
		return agvName;
	}
	/**
	 * 设置：型号
	 */
	public void setAgvModel(String agvModel) {
		this.agvModel = agvModel;
	}
	/**
	 * 获取：型号
	 */
	public String getAgvModel() {
		return agvModel;
	}
	/**
	 * 设置：厂家
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	/**
	 * 获取：厂家
	 */
	public String getVendor() {
		return vendor;
	}
	/**
	 * 设置：通讯方式
	 */
	public void setConnectType(Integer connectType) {
		this.connectType = connectType;
	}
	/**
	 * 获取：通讯方式
	 */
	public Integer getConnectType() {
		return connectType;
	}
	/**
	 * 设置：ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：端口
	 */
	public void setPort(Integer port) {
		this.port = port;
	}
	/**
	 * 获取：端口
	 */
	public Integer getPort() {
		return port;
	}
	/**
	 * 设置：所属仓位
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 获取：所属仓位
	 */
	public String getLocation() {
		return location;
	}
}
