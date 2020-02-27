package com.cowain.pms.modules.wms.entity.outerentity;

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
 * @date 2019-10-23 14:40:36
 */
@TableName("wms_out_pack")
public class WmsOupackEntity implements Serializable {
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
	 * 装箱单号
	 */
	private String packNo;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 装箱数
	 */
	private Integer itemNum;
	/**
	 * 客户名称
	 */
	private String custName;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
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
	 * 设置：装箱单号
	 */
	public void setPackNo(String packNo) {
		this.packNo = packNo;
	}
	/**
	 * 获取：装箱单号
	 */
	public String getPackNo() {
		return packNo;
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
	/**
	 * 设置：装箱数
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：装箱数
	 */
	public Integer getItemNum() {
		return itemNum;
	}


}
