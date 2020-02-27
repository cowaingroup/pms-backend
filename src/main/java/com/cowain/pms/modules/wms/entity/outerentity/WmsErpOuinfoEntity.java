package com.cowain.pms.modules.wms.entity.outerentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.sys.entity.ExcelColumn;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-23 16:00:41
 */
@TableName("wms_erp_out_info")
public class WmsErpOuinfoEntity implements Serializable {
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

	private Integer lineNo;
	/**
	 * erp 出货单号
	 */
	private String erpDocNo;
	/**
	 * wms出货单号
	 */
	private String wmsDocNo;
	/**
	 * 料号编码
	 */
	@ExcelColumn(columnName = "料号",require = true)
	private String itemCode;
	/**
	 * 料号名称
	 */
	@ExcelColumn(columnName = "名称",require = true)
	private String itemName;
	/**
	 * 料号规格
	 */
	@ExcelColumn(columnName = "规格",require = false)
	private String itemSpec;
	/**
	 * 料号说明
	 */
	@ExcelColumn(columnName = "描述",require = false)
	private String itemDesc;
	/**
	 * 料号单位
	 */
	@ExcelColumn(columnName = "单位",require = true)
	private String itemUnitCode;
	/**
	 * 数量
	 */
	@ExcelColumn(columnName = "数量",require = true)
	private Integer itemNum;
	/**
	 * 项目id
	 */
	@ExcelColumn(columnName = "项目ID",require = true)
	private String projectId;
	/**
	 * 项目名称
	 */
	@ExcelColumn(columnName = "项目名称",require = false)
	private String projectName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 出货单类型 1 标准出货 2 杂发 3 材料出库 4 机加工出库 
	 */
	private Integer docType;
	/**
	 * 1 创建状态 2 部分出仓 3 全部出仓 4 已复核 5 已发运 6 关闭
	 */
	private Integer status;
	/**
	 * 已经出仓数量
	 */
	private Integer shippedNum;
	/**
	 * 未出货数量
	 */
	private Integer unshippedNum;

	private Integer alloStatus;

	/**
	 * 客户名称
	 */
	@ExcelColumn(columnName = "客户名称",require = false)
	@TableField(exist = false)
	private String custName;
	/**
	 * 送货地址
	 */
	@ExcelColumn(columnName = "送货地址",require = false)
	@TableField(exist = false)
	private String addressName;

	@TableField(exist = false)
	private Integer pickNum;

	@TableField(exist = false)
	private Integer alloNum;


	@TableField(exist = false)
	private Integer reviewNum;

	@TableField(exist = false)
	private String positionCode;

	@TableField(exist = false)
	private Integer itemStatus;

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public Integer getAlloStatus() {
		return alloStatus;
	}

	public void setAlloStatus(Integer alloStatus) {
		this.alloStatus = alloStatus;
	}

	public Integer getPickNum() {
		return pickNum;
	}

	public void setPickNum(Integer pickNum) {
		this.pickNum = pickNum;
	}

	public Integer getAlloNum() {
		return alloNum;
	}

	public void setAlloNum(Integer alloNum) {
		this.alloNum = alloNum;
	}

	public Integer getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Integer reviewNum) {
		this.reviewNum = reviewNum;
	}

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
	 * 设置：erp 出货单号
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：erp 出货单号
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：wms出货单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms出货单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
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
	/**
	 * 设置：料号说明
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 获取：料号说明
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 设置：料号单位
	 */
	public void setItemUnitCode(String itemUnitCode) {
		this.itemUnitCode = itemUnitCode;
	}
	/**
	 * 获取：料号单位
	 */
	public String getItemUnitCode() {
		return itemUnitCode;
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
	 * 设置：项目id
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * 获取：项目id
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
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：出货单类型 1 标准出货 2 杂发 3 材料出库 4 机加工出库 
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：出货单类型 1 标准出货 2 杂发 3 材料出库 4 机加工出库 
	 */
	public Integer getDocType() {
		return docType;
	}
	/**
	 * 设置：1 创建状态 2 部分出仓 3 全部出仓 4 已复核 5 已发运 6 关闭
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：1 创建状态 2 部分出仓 3 全部出仓 4 已复核 5 已发运 6 关闭
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：已经出仓数量
	 */
	public void setShippedNum(Integer shippedNum) {
		this.shippedNum = shippedNum;
	}
	/**
	 * 获取：已经出仓数量
	 */
	public Integer getShippedNum() {
		return shippedNum;
	}
	/**
	 * 设置：未出货数量
	 */
	public void setUnshippedNum(Integer unshippedNum) {
		this.unshippedNum = unshippedNum;
	}
	/**
	 * 获取：未出货数量
	 */
	public Integer getUnshippedNum() {
		return unshippedNum;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}


	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
}
