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
 * @date 2019-07-18 19:24:35
 */
@TableName("t_warehouse_agv")
public class WarehouseAgvEntity implements Serializable {
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
	 * 仓位id
	 */
	private Integer warehouseId;
	/**
	 * Agv id
	 */
	private Integer agvId;
	/**
	 * 状态
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
	 * 设置：仓位id
	 */
	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}
	/**
	 * 获取：仓位id
	 */
	public Integer getWarehouseId() {
		return warehouseId;
	}
	/**
	 * 设置：Agv id
	 */
	public void setAgvId(Integer agvId) {
		this.agvId = agvId;
	}
	/**
	 * 获取：Agv id
	 */
	public Integer getAgvId() {
		return agvId;
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
