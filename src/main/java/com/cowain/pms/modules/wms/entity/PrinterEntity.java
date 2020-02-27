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
 * @date 2019-09-24 09:16:49
 */
@TableName("t_printer")
public class PrinterEntity implements Serializable {
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
	 * 打印机名称
	 */
	private String name;
	/**
	 * 规格(a4,单据)
	 */
	private String paperType;
	/**
	 * 方向(横向,纵向)
	 */
	private String direction;
	/**
	 * 备注
	 */
	private String remark;

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
	 * 设置：打印机名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：打印机名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：规格(a4,单据)
	 */
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	/**
	 * 获取：规格(a4,单据)
	 */
	public String getPaperType() {
		return paperType;
	}
	/**
	 * 设置：方向(横向,纵向)
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/**
	 * 获取：方向(横向,纵向)
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}
