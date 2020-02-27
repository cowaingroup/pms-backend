package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cowain.pms.modules.sys.entity.ExcelColumn;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-11 08:08:56
 */
@TableName("t_wh_location")
public class WhLocationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;

	@ExcelColumn(columnName = "库位编号",require = true)
	private String whLocationCode;

	@ExcelColumn(columnName = "所属仓库",require = true)
	private String whId;

	@ExcelColumn(columnName = "所属库区",require = true)
	private String whAreaId;

	private String whLocationStatus;

    @ExcelColumn(columnName = "备注",require = false)
	private String remarks;

    @ExcelColumn(columnName = "库位类型",require = false)
    private String whLocationType;
	/**
	 * 获取备注
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 显示状态
	 */
	@TableField(exist = false)
	private String showState;

	private Integer whDistance;

	public Integer getWhDistance() {
		return whDistance;
	}

	public void setWhDistance(Integer whDistance) {
		this.whDistance = whDistance;
	}

	/**
	 * 获取显示状态
	 */
	public String getShowArea() {
		return showArea;
	}
	/**
	 * 设置显示状态
	 */
	public void setShowArea(String showArea) {
		this.showArea = showArea;
	}
	/**
	 * 获取显示库位的类型String
	 */
	public String getLocaltionTypeName() {
		return localtionTypeName;
	}
	/**
	 * 设置显示库位的类型String
	 */
	public void setLocaltionTypeName(String localtionTypeName) {
		this.localtionTypeName = localtionTypeName;
	}

	/**
	 * 显示库位的类型String
	 */
	@TableField(exist = false)
	private String localtionTypeName;

	/**
	 * 获取库位状态 int
	 */
	public String getWhLocationType() {
		return whLocationType;
	}
	/**
	 * 设置库位状态 int
	 */
	public void setWhLocationType(String whLocationType) {
		this.whLocationType = whLocationType;
	}

	/**
	 * 显示库位
	 */
	@TableField(exist = false)
	private String showArea;
	/**
	 * 获取显示状态
	 */
	public String getShowState() {
		return showState;
	}
	/**
	 * 设置状态
	 */
	public void setShowState(String showState) {
		this.showState = showState;
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
	 * 设置：库位编号
	 */
	public void setWhLocationCode(String whLocationCode) {
		this.whLocationCode = whLocationCode;
	}
	/**
	 * 获取：库位编号
	 */
	public String getWhLocationCode() {
		return whLocationCode;
	}
	/**
	 * 设置：所属仓库
	 */
	public void setWhId(String whId) {
		this.whId = whId;
	}
	/**
	 * 获取：所属仓库
	 */
	public String getWhId() {
		return whId;
	}
	/**
	 * 设置：所属库区
	 */
	public void setWhAreaId(String whAreaId) {
		this.whAreaId = whAreaId;
	}
	/**
	 * 获取：所属库区
	 */
	public String getWhAreaId() {
		return whAreaId;
	}
	/**
	 * 设置：状态
	 */
	public void setWhLocationStatus(String whLocationStatus) {
		this.whLocationStatus = whLocationStatus;
	}
	/**
	 * 获取：状态
	 */
	public String getWhLocationStatus() {
		return whLocationStatus;
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

	@TableField(exist = false)
	private String t;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	/**
	 * 显示库区名称(根据ID字段映射)
	 */
	@TableField(exist = false)
	private String showAreaName;

	public String getShowAreaName() {
		return showAreaName;
	}

	public void setShowAreaName(String showAreaName) {
		this.showAreaName = showAreaName;
	}

	public String getShowHouseName() {
		return showHouseName;
	}

	public void setShowHouseName(String showHouseName) {
		this.showHouseName = showHouseName;
	}

	/**
	 * 显示仓库名称(根据ID字段映射)
	 */
	@TableField(exist = false)
	private String showHouseName;
}
