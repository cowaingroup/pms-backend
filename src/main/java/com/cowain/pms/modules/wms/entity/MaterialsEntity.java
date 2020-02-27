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
 * @date 2019-11-20 14:25:19
 */
@TableName("t_materials")
public class MaterialsEntity implements Serializable {
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
	 * 料号
	 */
	private String materialNumber;
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 所属货类（货类管理的货类）
	 */
	private String cargoName;
	/**
	 * 存储地点（货类里的上架货区）
	 */
	private String loadingArea;
	/**
	 * 品名
	 */
	private String materialName;
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
	 * 设置：料号
	 */
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	/**
	 * 获取：料号
	 */
	public String getMaterialNumber() {
		return materialNumber;
	}
	/**
	 * 设置：描述
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * 获取：描述
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * 设置：所属货类（货类管理的货类）
	 */
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	/**
	 * 获取：所属货类（货类管理的货类）
	 */
	public String getCargoName() {
		return cargoName;
	}
	/**
	 * 设置：存储地点（货类里的上架货区）
	 */
	public void setLoadingArea(String loadingArea) {
		this.loadingArea = loadingArea;
	}
	/**
	 * 获取：存储地点（货类里的上架货区）
	 */
	public String getLoadingArea() {
		return loadingArea;
	}
	/**
	 * 设置：品名
	 */
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	/**
	 * 获取：品名
	 */
	public String getMaterialName() {
		return materialName;
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
