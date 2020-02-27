package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 上架规则
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-15 12:58:03
 */
@TableName("wms_shelf_rule")
public class WmsShelfRuleEntity implements Serializable {
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
	 * 货主
	 */
	private String ownerCode;
	/**
	 * 按仓库
	 */
	private String houseBasic;
	/**
	 * 按库区工作区
	 */
	private String areaBasic;
	/**
	 * 按货类
	 */
	private String goodsBasic;
	/**
	 * 随机
	 */
	private String randomBasic;
	/**
	 * 智能
	 */
	private String intelligentBasic;

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
	 * 设置：货主
	 */
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	/**
	 * 获取：货主
	 */
	public String getOwnerCode() {
		return ownerCode;
	}
	/**
	 * 设置：按仓库
	 */
	public void setHouseBasic(String houseBasic) {
		this.houseBasic = houseBasic;
	}
	/**
	 * 获取：按仓库
	 */
	public String getHouseBasic() {
		return houseBasic;
	}
	/**
	 * 设置：按库区工作区
	 */
	public void setAreaBasic(String areaBasic) {
		this.areaBasic = areaBasic;
	}
	/**
	 * 获取：按库区工作区
	 */
	public String getAreaBasic() {
		return areaBasic;
	}
	/**
	 * 设置：按货类
	 */
	public void setGoodsBasic(String goodsBasic) {
		this.goodsBasic = goodsBasic;
	}
	/**
	 * 获取：按货类
	 */
	public String getGoodsBasic() {
		return goodsBasic;
	}
	/**
	 * 设置：随机
	 */
	public void setRandomBasic(String randomBasic) {
		this.randomBasic = randomBasic;
	}
	/**
	 * 获取：随机
	 */
	public String getRandomBasic() {
		return randomBasic;
	}
	/**
	 * 设置：智能
	 */
	public void setIntelligentBasic(String intelligentBasic) {
		this.intelligentBasic = intelligentBasic;
	}
	/**
	 * 获取：智能
	 */
	public String getIntelligentBasic() {
		return intelligentBasic;
	}
}
