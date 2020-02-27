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
@TableName("t_pad")
public class PadEntity implements Serializable {
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
	 * 设备名称
	 */
	private String name;
	/**
	 * 设备型号
	 */
	private String model;
	/**
	 * 通信协议
	 */
	private String connProtocol;
	/**
	 * ip地址
	 */
	private String ip;
	/**
	 * 端口
	 */
	private String port;
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
	 * 设置：设备名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：设备名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：设备型号
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * 获取：设备型号
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 设置：通信协议
	 */
	public void setConnProtocol(String connProtocol) {
		this.connProtocol = connProtocol;
	}
	/**
	 * 获取：通信协议
	 */
	public String getConnProtocol() {
		return connProtocol;
	}
	/**
	 * 设置：ip地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：ip地址
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：端口
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * 获取：端口
	 */
	public String getPort() {
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
