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
 * @date 2019-11-11 11:03:10
 */
@TableName("wms_loading")
public class WmsLoadingEntity implements Serializable {
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
	 * 装车单号
	 */
	private String loadingNumber;
	/**
	 * 提货人
	 */
	private String userId;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 车牌号
	 */
	private String licensePlate;
	/**
	 * 创建时间
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
	 * 设置：装车单号
	 */
	public void setLoadingNumber(String loadingNumber) {
		this.loadingNumber = loadingNumber;
	}
	/**
	 * 获取：装车单号
	 */
	public String getLoadingNumber() {
		return loadingNumber;
	}
	/**
	 * 设置：提货人
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：提货人
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：电话
	 */

	/**
	 * 设置：车牌号
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	/**
	 * 获取：车牌号
	 */
	public String getLicensePlate() {
		return licensePlate;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
