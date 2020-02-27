//package com.cowain.pms.modules.wms.entity;
//
//import com.baomidou.mybatisplus.annotations.TableField;
//import com.baomidou.mybatisplus.annotations.TableId;
//import com.baomidou.mybatisplus.annotations.TableName;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
///**
// *
// *
// * @author tom
// * @email zhaoxinsheng@cowain.com.cn
// * @date 2019-07-16 08:11:27
// */
//@TableName("wms_doc")
//public class WmsDocEntity implements Serializable {
//	private static final long serialVersionUID = 1L;
//	private String t;
//	private int id;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	/**
//	 * wms单号
//	 */
//	private String wmsDocNo;
//	/**
//	 * 回传状态
//	 */
//	private Integer wmsStatus;
//	/**
//	 * erp单号
//	 */
//	private String erpDocNo;
//	/**
//	 * 状态
//	 */
//	private Integer erpStatus;
//	/**
//	 * 插入时间
//	 */
//	private Date insertTime;
//	/**
//	 * 数据来源表
//	 */
//	private int type;
//	/***
//	 * 数据来源库
//	 */
//	private  int dataSource;
//	/***预期到货时间
//	 * */
//	private  String arrivalTime;
//	/***
//	 * 销售订单类型
//	 * */
//	private int orderType;
//
//	/**
//	 * 存储类型
//	 */
//	private  int storeType;
//
//
//	private int docType;
//
//	private String wcsStatus;
//
//	public String getWcsStatus() {
//		return wcsStatus;
//	}
//
//	public void setWcsStatus(String wcsStatus) {
//		this.wcsStatus = wcsStatus;
//	}
//
//	public int getDocType() {
//		return docType;
//	}
//
//	public void setDocType(int docType) {
//		this.docType = docType;
//	}
//
//	public void setType(int type) {
//		this.type = type;
//	}
//
//	public int getStoreType() {
//		return storeType;
//	}
//
//	public void setStoreType(int storeType) {
//		this.storeType = storeType;
//	}
//
//	public String getT() {
//		return t;
//	}
//
//	public void setT(String t) {
//		this.t = t;
//	}
//
//	public String getWmsDocNo() {
//		return wmsDocNo;
//	}
//
//	public void setWmsDocNo(String wmsDocNo) {
//		this.wmsDocNo = wmsDocNo;
//	}
//
//	public Integer getWmsStatus() {
//		return wmsStatus;
//	}
//
//	public void setWmsStatus(Integer wmsStatus) {
//		this.wmsStatus = wmsStatus;
//	}
//
//	public String getErpDocNo() {
//		return erpDocNo;
//	}
//
//	public void setErpDocNo(String erpDocNo) {
//		this.erpDocNo = erpDocNo;
//	}
//
//	public Integer getErpStatus() {
//		return erpStatus;
//	}
//
//	public void setErpStatus(Integer erpStatus) {
//		this.erpStatus = erpStatus;
//	}
//
//	public Date getInsertTime() {
//		return insertTime;
//	}
//
//	public void setInsertTime(Date insertTime) {
//		this.insertTime = insertTime;
//	}
//
//	public int getType() {
//		return type;
//	}
//
//
//	public int getDataSource() {
//		return dataSource;
//	}
//
//	public void setDataSource(int dataSource) {
//		this.dataSource = dataSource;
//	}
//
//	public String getArrivalTime() {
//		return arrivalTime;
//	}
//
//	public void setArrivalTime(String arrivalTime) {
//		this.arrivalTime = arrivalTime;
//	}
//
//	public int getOrderType() {
//		return orderType;
//	}
//
//	public void setOrderType(int orderType) {
//		this.orderType = orderType;
//	}
//}
