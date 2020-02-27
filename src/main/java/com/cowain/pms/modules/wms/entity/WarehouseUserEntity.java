package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-15 10:00:34
 */
@TableName("t_warehouse_user")
public class WarehouseUserEntity implements Serializable {
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
	 * 仓库id
	 */
	private Integer warehouseId;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 状态 t_dict
	 */
	private Integer status;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 操作人
	 */
	private Integer insertUser;

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
	 * 设置：仓库id
	 */
	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}
	/**
	 * 获取：仓库id
	 */
	public Integer getWarehouseId() {
		return warehouseId;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：状态 t_dict
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 t_dict
	 */
	public Integer getStatus() {
		return status;
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
	 * 设置：操作人
	 */
	public void setInsertUser(Integer insertUser) {
		this.insertUser = insertUser;
	}
	/**
	 * 获取：操作人
	 */
	public Integer getInsertUser() {
		return insertUser;
	}
}
