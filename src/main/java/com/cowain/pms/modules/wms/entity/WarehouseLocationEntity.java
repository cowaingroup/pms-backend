package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
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
 * @date 2019-07-17 17:34:04
 */
@TableName("t_warehouse_location")
public class WarehouseLocationEntity implements Serializable {
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
	 * 编号
	 */
	private String code;
	/**
	 * 1 1楼  2 2楼 3 3楼
	 */
	private String location;
	/**
	 * 仓位类型 1 棕化仓 2 防焊仓 3 棕化线边仓 4 防焊线边仓
	 */
	private Integer type;
	/**
	 * 高
	 */
	private Double hight;
	/**
	 * 宽
	 */
	private Double weight;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 操作人
	 */
	private Integer insertUser;
	/**
	 * 状态 1 空闲 2 进行中 3 占用
	 */
	private Integer status;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 细分类型
	 */
	private Integer catetgoryType;

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
	 * 设置：编号
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：编号
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：1 1楼  2 2楼 3 3楼
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 获取：1 1楼  2 2楼 3 3楼
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * 设置：仓位类型 1 棕化仓 2 防焊仓 3 棕化线边仓 4 防焊线边仓
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：仓位类型 1 棕化仓 2 防焊仓 3 棕化线边仓 4 防焊线边仓
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：高
	 */
	public void setHight(Double hight) {
		this.hight = hight;
	}
	/**
	 * 获取：高
	 */
	public Double getHight() {
		return hight;
	}
	/**
	 * 设置：宽
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	/**
	 * 获取：宽
	 */
	public Double getWeight() {
		return weight;
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
	/**
	 * 设置：状态 1 空闲 2 进行中 3 占用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 1 空闲 2 进行中 3 占用
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：细分类型
	 */
	public void setCatetgoryType(Integer catetgoryType) {
		this.catetgoryType = catetgoryType;
	}
	/**
	 * 获取：细分类型
	 */
	public Integer getCatetgoryType() {
		return catetgoryType;
	}
}
