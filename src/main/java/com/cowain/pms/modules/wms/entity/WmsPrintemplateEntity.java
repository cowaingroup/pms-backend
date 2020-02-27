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
 * @date 2019-11-18 13:32:17
 */
@TableName("wms_print_template")
public class WmsPrintemplateEntity implements Serializable {
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
	 * 模板名称
	 */
	private String name;
	/**
	 * 模板类别
	 */
	private Integer category;
	/**
	 * 模板属性
	 */
	private Integer attribute;
	/**
	 * 存储方式
	 */
	private Integer storageMode;
	/**
	 * 模板明细
	 */
	private String detailed;
	/**
	 * 
	 */
	private Date createTime;

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
	 * 设置：模板名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：模板名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：模板类别
	 */
	public void setCategory(Integer category) {
		this.category = category;
	}
	/**
	 * 获取：模板类别
	 */
	public Integer getCategory() {
		return category;
	}
	/**
	 * 设置：模板属性
	 */
	public void setAttribute(Integer attribute) {
		this.attribute = attribute;
	}
	/**
	 * 获取：模板属性
	 */
	public Integer getAttribute() {
		return attribute;
	}
	/**
	 * 设置：存储方式
	 */
	public void setStorageMode(Integer storageMode) {
		this.storageMode = storageMode;
	}
	/**
	 * 获取：存储方式
	 */
	public Integer getStorageMode() {
		return storageMode;
	}
	/**
	 * 设置：模板明细
	 */
	public void setDetailed(String detailed) {
		this.detailed = detailed;
	}
	/**
	 * 获取：模板明细
	 */
	public String getDetailed() {
		return detailed;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
