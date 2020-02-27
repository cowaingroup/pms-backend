package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.sys.entity.ExcelColumn;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-27 09:54:51
 */
@TableName("t_owner_info")
public class OwnerInfoEntity implements Serializable {
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

	@TableField(exist = false)
	private String houseCode;

	@TableField(exist = false)
	private List<Long> houseIdList;

	@ExcelColumn(columnName = "货主名称",require = true)
	private String ownerName;

	@ExcelColumn(columnName ="货主编码",require = true)
	private String ownerCode;

	@ExcelColumn(columnName = "地址",require = true)
	private String address;

	@ExcelColumn(columnName = "联系人",require = true)
	private String contact;

	@ExcelColumn(columnName = "电话",require = true)
	private String phone;

	@ExcelColumn(columnName = "邮箱",require = true)
	private String mail;

	@ExcelColumn(columnName = "所属行业",require = true)
	private String industry;

	public List<Long> getHouseIdList() {
		return houseIdList;
	}

	public void setHouseIdList(List<Long> houseIdList) {
		this.houseIdList = houseIdList;
	}

	public String getHouseCode() {
		return houseCode;
	}

	public void setHouseCode(String houseCode) {
		this.houseCode = houseCode;
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
	 * 设置：货主名称
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * 获取：货主名称
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * 设置：货主编码
	 */
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	/**
	 * 获取：货主编码
	 */
	public String getOwnerCode() {
		return ownerCode;
	}
	/**
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：联系人
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * 获取：联系人
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * 获取：邮箱
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * 设置：行业
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	/**
	 * 获取：行业
	 */
	public String getIndustry() {
		return industry;
	}
}
