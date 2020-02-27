package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.sys.entity.ExcelColumn;

import java.io.Serializable;
import java.util.Date;

/**
 * 移库单明细
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-11 13:20:04
 */
@TableName("wms_move_detail")
public class WmsMoveDetailEntity implements Serializable {
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
	 * 父
	 */
	private Integer parentId;
	@ExcelColumn(columnName = "料号",require = true)
	private String itemCode;
	@ExcelColumn(columnName = "名称",require = true)
	private String itemName;
	@ExcelColumn(columnName = "单位",require = true)
	private String itemUnitCode;
	@ExcelColumn(columnName = "数量",require = true)
	private Integer itemPredictNum;
	/**
	 * 
	 */
	private Integer itemFinishNum;
	@ExcelColumn(columnName = "原库位",require = true)
	private String originalBoxCode;
	@ExcelColumn(columnName="目标库位",require = true)
	private String targetBoxCode;

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
	 * 设置：
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：
	 */
	public void setItemPredictNum(Integer itemPredictNum) {
		this.itemPredictNum = itemPredictNum;
	}
	/**
	 * 获取：
	 */
	public Integer getItemPredictNum() {
		return itemPredictNum;
	}
	/**
	 * 设置：
	 */
	public void setItemFinishNum(Integer itemFinishNum) {
		this.itemFinishNum = itemFinishNum;
	}
	/**
	 * 获取：
	 */
	public Integer getItemFinishNum() {
		return itemFinishNum;
	}
	/**
	 * 设置：
	 */
	public void setOriginalBoxCode(String originalBoxCode) {
		this.originalBoxCode = originalBoxCode;
	}
	/**
	 * 获取：
	 */
	public String getOriginalBoxCode() {
		return originalBoxCode;
	}
	/**
	 * 设置：
	 */
	public void setTargetBoxCode(String targetBoxCode) {
		this.targetBoxCode = targetBoxCode;
	}
	/**
	 * 获取：
	 */
	public String getTargetBoxCode() {
		return targetBoxCode;
	}

	public String getItemUnitCode() {
		return itemUnitCode;
	}

	public void setItemUnitCode(String itemUnitCode) {
		this.itemUnitCode = itemUnitCode;
	}
}
