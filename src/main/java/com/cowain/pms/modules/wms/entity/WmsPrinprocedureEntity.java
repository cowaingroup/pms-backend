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
@TableName("wms_print_procedure")
public class WmsPrinprocedureEntity implements Serializable {
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
	 * 供应商
	 */
	private String supplier;
	/**
	 * 加工收料单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer receivNo;
	/**
	 * 进料拒收单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer qulityCheckNo;
	/**
	 * 装箱单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer boxNo;
	/**
	 * 栈板单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer palletNo;
	/**
	 * 拣货单单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer pickNo;
	/**
	 * 出库单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer outNo;
	/**
	 * 入库单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer inNo;
	/**
	 * 装车单   0 ：不打印 1：前置打印  2：后置打印
	 */
	private Integer loadingNo;
	/**
	 * 
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
	 * 设置：供应商
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	/**
	 * 获取：供应商
	 */
	public String getSupplier() {
		return supplier;
	}
	/**
	 * 设置：加工收料单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setReceivNo(Integer receivNo) {
		this.receivNo = receivNo;
	}
	/**
	 * 获取：加工收料单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getReceivNo() {
		return receivNo;
	}
	/**
	 * 设置：进料拒收单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setQulityCheckNo(Integer qulityCheckNo) {
		this.qulityCheckNo = qulityCheckNo;
	}
	/**
	 * 获取：进料拒收单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getQulityCheckNo() {
		return qulityCheckNo;
	}
	/**
	 * 设置：装箱单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setBoxNo(Integer boxNo) {
		this.boxNo = boxNo;
	}
	/**
	 * 获取：装箱单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getBoxNo() {
		return boxNo;
	}
	/**
	 * 设置：栈板单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setPalletNo(Integer palletNo) {
		this.palletNo = palletNo;
	}
	/**
	 * 获取：栈板单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getPalletNo() {
		return palletNo;
	}
	/**
	 * 设置：拣货单单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setPickNo(Integer pickNo) {
		this.pickNo = pickNo;
	}
	/**
	 * 获取：拣货单单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getPickNo() {
		return pickNo;
	}
	/**
	 * 设置：出库单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setOutNo(Integer outNo) {
		this.outNo = outNo;
	}
	/**
	 * 获取：出库单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getOutNo() {
		return outNo;
	}
	/**
	 * 设置：入库单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setInNo(Integer inNo) {
		this.inNo = inNo;
	}
	/**
	 * 获取：入库单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getInNo() {
		return inNo;
	}
	/**
	 * 设置：装车单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public void setLoadingNo(Integer loadingNo) {
		this.loadingNo = loadingNo;
	}
	/**
	 * 获取：装车单   0 ：不打印 1：前置打印  2：后置打印
	 */
	public Integer getLoadingNo() {
		return loadingNo;
	}
	/**
	 * 设置：
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreatTime() {
		return creatTime;
	}
}
