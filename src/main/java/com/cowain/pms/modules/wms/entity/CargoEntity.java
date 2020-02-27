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
 * @date 2019-11-20 08:58:36
 */
@TableName("t_cargo")
public class CargoEntity implements Serializable {
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
	 * 货类名称
	 */
	private String cargoName;
	/**
	 * 货类编码
	 */
	private String cargoCode;
	/**
	 * 所属货主
	 */
	private String ownerName;
	/**
	 * 上架货区
	 */
	private String loadingArea;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 创建时间
	 */
	private Date creatTime;

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
	 * 设置：货类名称
	 */
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	/**
	 * 获取：货类名称
	 */
	public String getCargoName() {
		return cargoName;
	}
	/**
	 * 设置：货类编码
	 */
	public void setCargoCode(String cargoCode) {
		this.cargoCode = cargoCode;
	}
	/**
	 * 获取：货类编码
	 */
	public String getCargoCode() {
		return cargoCode;
	}
	/**
	 * 设置：所属货主
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * 获取：所属货主
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * 设置：上架货区
	 */
	public void setLoadingArea(String loadingArea) {
		this.loadingArea = loadingArea;
	}
	/**
	 * 获取：上架货区
	 */
	public String getLoadingArea() {
		return loadingArea;
	}
	/**
	 * 设置：单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatTime() {
		return creatTime;
	}
}
