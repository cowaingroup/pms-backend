package com.cowain.pms.modules.pms.dto;

import com.cowain.pms.modules.pms.entity.PmsRoleEntity;

/**
 * @author Mr.Sun
 * @version 1.0
 * @Date 2020/1/11 10:57
 */
public class PmsRoleDto extends PmsRoleEntity {
    private Integer countNum;

    private String orgType;

    private String roleTypes;

    public Integer getCountNum() {
        return countNum;
    }

    public void setCountNum(Integer countNum) {
        this.countNum = countNum;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getRoleTypes() {
        return roleTypes;
    }

    public void setRoleTypes(String roleTypes) {
        this.roleTypes = roleTypes;
    }
}
