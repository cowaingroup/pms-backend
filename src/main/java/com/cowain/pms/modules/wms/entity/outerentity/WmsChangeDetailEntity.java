package com.cowain.pms.modules.wms.entity.outerentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 形态转换详情表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-05 16:23:36
 */
@TableName("wms_change_detail")
public class WmsChangeDetailEntity implements Serializable {
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
	 * 形态转换主表id
	 */
	private Integer changeId;
	/**
	 * 料号编码
	 */
	private String itemCode;
	/**
	 * 料号名称
	 */
	private String itemName;
	/**
	 * 转换数量
	 */
	private Integer itemNum;
	/**
	 * 转换前项目编码
	 */
	private String preProjectId;
	/**
	 * 转换前项目名称
	 */
	private String preProjectName;
	/**
	 * 转换后项目编码
	 */
	private String targetProjectId;
	/**
	 * 转换后项目名称
	 */
	private String targetProjectName;
	/**
	 * 行号
	 */
	private Integer lineNo;

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
	 * 设置：形态转换主表id
	 */
	public void setChangeId(Integer changeId) {
		this.changeId = changeId;
	}
	/**
	 * 获取：形态转换主表id
	 */
	public Integer getChangeId() {
		return changeId;
	}
	/**
	 * 设置：料号编码
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：料号编码
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：料号名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：料号名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：转换数量
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：转换数量
	 */
	public Integer getItemNum() {
		return itemNum;
	}
	/**
	 * 设置：转换前项目编码
	 */
	public void setPreProjectId(String preProjectId) {
		this.preProjectId = preProjectId;
	}
	/**
	 * 获取：转换前项目编码
	 */
	public String getPreProjectId() {
		return preProjectId;
	}
	/**
	 * 设置：转换前项目名称
	 */
	public void setPreProjectName(String preProjectName) {
		this.preProjectName = preProjectName;
	}
	/**
	 * 获取：转换前项目名称
	 */
	public String getPreProjectName() {
		return preProjectName;
	}
	/**
	 * 设置：转换后项目编码
	 */
	public void setTargetProjectId(String targetProjectId) {
		this.targetProjectId = targetProjectId;
	}
	/**
	 * 获取：转换后项目编码
	 */
	public String getTargetProjectId() {
		return targetProjectId;
	}
	/**
	 * 设置：转换后项目名称
	 */
	public void setTargetProjectName(String targetProjectName) {
		this.targetProjectName = targetProjectName;
	}
	/**
	 * 获取：转换后项目名称
	 */
	public String getTargetProjectName() {
		return targetProjectName;
	}
	/**
	 * 设置：行号
	 */
	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}
	/**
	 * 获取：行号
	 */
	public Integer getLineNo() {
		return lineNo;
	}
}
