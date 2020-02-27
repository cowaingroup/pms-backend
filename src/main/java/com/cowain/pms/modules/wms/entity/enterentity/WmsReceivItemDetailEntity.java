package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * PDA 或其他设备收单明细表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
@TableName("wms_receiv_item_detail")
public class WmsReceivItemDetailEntity implements Serializable {
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

	private String wmsDocNo;

	private Integer lineNo;

	/**
	 * 进入wms 渠道
	 */
	private String channelType;
    /**
     * 单据类型
     */
    private Integer docType;
	/**
	 * 设备类型 1 pad 2 扫码枪 3 pc 4 其他
	 */
	private String deviceType;
	/**
	 * 全局唯一ID
	 */
	private String globalId;

	private String itemSn;
	/**
	 * 料号编码
	 */
	private String itemCode;
	/**
	 * 料号名称
	 */
	private String itemName;
	/**
	 * 数量
	 */
	private Integer itemNum;

	/**
	 * 采购数量
	 */
	private Integer preNum;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 供应商id
	 */
	private String supplyId;
	/**
	 * 供应商名称
	 */
	private String supplyName;
	/**
	 * 采购单号
	 */
	private String poCode;

	/**
	 * 料号id
	 */
	private String itemId;
	/**
	 * 物料描述
	 */
	private String itemDesc;
	/**
	 * 物料单位
	 */
	private String itemUnit;
	/**
	 * 发包方式
	 */
	private Integer deliverType;
	/**
	 * 项目编号
	 */
	private String projectId;
	/**
	 * 项目名称
	 */
	private String projectName;
	/**
	 * 料号规格
	 */
	private String itemSpec;

	private String positionCode;

	private String areaCode;

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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
	 * 设置：进入wms 渠道
	 */
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	/**
	 * 获取：进入wms 渠道
	 */
	public String getChannelType() {
		return channelType;
	}
	/**
	 * 设置：设备类型 1 pad 2 扫码枪 3 pc 4 其他
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	/**
	 * 获取：设备类型 1 pad 2 扫码枪 3 pc 4 其他
	 */
	public String getDeviceType() {
		return deviceType;
	}
	/**
	 * 设置：全局唯一ID
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	/**
	 * 获取：全局唯一ID
	 */
	public String getGlobalId() {
		return globalId;
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
	 * 设置：数量
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：数量
	 */
	public Integer getItemNum() {
		return itemNum;
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
	 * 设置：用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：供应商id
	 */
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	/**
	 * 获取：供应商id
	 */
	public String getSupplyId() {
		return supplyId;
	}
	/**
	 * 设置：供应商名称
	 */
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getSupplyName() {
		return supplyName;
	}
	/**
	 * 设置：采购单号
	 */
	public void setPoCode(String poCode) {
		this.poCode = poCode;
	}
	/**
	 * 获取：采购单号
	 */
	public String getPoCode() {
		return poCode;
	}
	/**
	 * 设置：料号id
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：料号id
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * 设置：物料描述
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 获取：物料描述
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 设置：物料单位
	 */
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	/**
	 * 获取：物料单位
	 */
	public String getItemUnit() {
		return itemUnit;
	}
	/**
	 * 设置：发包方式
	 */
	public void setDeliverType(Integer deliverType) {
		this.deliverType = deliverType;
	}
	/**
	 * 获取：发包方式
	 */
	public Integer getDeliverType() {
		return deliverType;
	}
	/**
	 * 设置：项目编号
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * 获取：项目编号
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * 设置：项目名称
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * 获取：项目名称
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 设置：料号规格
	 */
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}
	/**
	 * 获取：料号规格
	 */
	public String getItemSpec() {
		return itemSpec;
	}


    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public Integer getDocType() {
        return docType;
    }

    public Integer getPreNum() {
        return preNum;
    }

    public void setPreNum(Integer preNum) {
        this.preNum = preNum;
    }


}
