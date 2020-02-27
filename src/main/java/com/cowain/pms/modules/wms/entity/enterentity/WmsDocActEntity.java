package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 出入库执行表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-24 10:34:54
 */
@TableName("wms_doc_act")
public class WmsDocActEntity implements Serializable {
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
	 * 对应wms_doc_detail的id
	 */
	private Integer parentId;
	/**
	 * wms单号
	 */
	private String wmsDocNo;

	private Integer lineNo;
	/**
	 * 名称
	 */
	private String itemName;
	/**
	 * 料号
	 */
	private String itemCode;

	private String itemSn;
	/**
	 * 目标数量
	 */
	private Integer itemTargetNum;
	/**
	 * 实际数量
	 */
	private Integer itemActualNum;
	/**
	 * 单位
	 */
	private String itemUnitCode;
	/**
	 * 目标库位
	 */
	private String itemTargetBox;
	/**
	 * 目标库位
	 */
	private String itemActualBox;
	/**
	 * 状态  1未执行 2 已执行
	 */
	private Integer itemStatus;
	/**
	 * 操作人员
	 */
	private String actUser;
	/**
	 * 操作时间
	 */
	private Date actTime;

	@TableField(exist = false)
	private String  erpDocNo;

	@TableField(exist = false)
	private String  boxStatus;

	@TableField(exist = false)
	private Integer itemNum;

	@TableField(exist = false)
	private String  projectId;

	@TableField(exist = false)
	private String projectName;

	private  String globalId;

	public String getItemSn() {
		return itemSn;
	}

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public String getErpDocNo() {
		return erpDocNo;
	}

	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBoxStatus() {
		return boxStatus;
	}

	public void setBoxStatus(String boxStatus) {
		this.boxStatus = boxStatus;
	}

	public Integer getItemNum() {
		return itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
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
	 * 设置：对应wms_doc_detail的id
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：对应wms_doc_detail的id
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：wms单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：料号
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：料号
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：目标数量
	 */
	public void setItemTargetNum(Integer itemTargetNum) {
		this.itemTargetNum = itemTargetNum;
	}
	/**
	 * 获取：目标数量
	 */
	public Integer getItemTargetNum() {
		return itemTargetNum;
	}
	/**
	 * 设置：实际数量
	 */
	public void setItemActualNum(Integer itemActualNum) {
		this.itemActualNum = itemActualNum;
	}
	/**
	 * 获取：实际数量
	 */
	public Integer getItemActualNum() {
		return itemActualNum;
	}
	/**
	 * 设置：单位
	 */
	public void setItemUnitCode(String itemUnitCode) {
		this.itemUnitCode = itemUnitCode;
	}
	/**
	 * 获取：单位
	 */
	public String getItemUnitCode() {
		return itemUnitCode;
	}
	/**
	 * 设置：目标库位
	 */
	public void setItemTargetBox(String itemTargetBox) {
		this.itemTargetBox = itemTargetBox;
	}
	/**
	 * 获取：目标库位
	 */
	public String getItemTargetBox() {
		return itemTargetBox;
	}
	/**
	 * 设置：目标库位
	 */
	public void setItemActualBox(String itemActualBox) {
		this.itemActualBox = itemActualBox;
	}
	/**
	 * 获取：目标库位
	 */
	public String getItemActualBox() {
		return itemActualBox;
	}
	/**
	 * 设置：状态  1未执行 2 已执行
	 */
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
	/**
	 * 获取：状态  1未执行 2 已执行
	 */
	public Integer getItemStatus() {
		return itemStatus;
	}


	public String getActUser() {
		return actUser;
	}

	public void setActUser(String actUser) {
		this.actUser = actUser;
	}

	public Date getActTime() {
		return actTime;
	}

	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}
}
