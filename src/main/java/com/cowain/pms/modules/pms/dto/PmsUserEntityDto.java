package com.cowain.pms.modules.pms.dto;

import com.cowain.pms.modules.pms.entity.PmsUserEntity;

public class PmsUserEntityDto extends PmsUserEntity {


    //角色所属
    private String org;
    //部门
    private String dept;
    //角色
    private String  roleShow;
    //职位
    private String jobs;

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getRoleShow() {
        return roleShow;
    }

    public void setRoleShow(String roleShow) {
        this.roleShow = roleShow;
    }
}
