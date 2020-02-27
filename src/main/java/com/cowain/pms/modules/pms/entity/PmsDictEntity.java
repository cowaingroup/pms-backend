package com.cowain.pms.modules.pms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("t_dict")
public class PmsDictEntity {

    @TableId
    private Integer Id;

    private Integer code;

    private Integer sort;

    private String type;

    private String explain;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return "PmsDictEntity{" +
                "Id=" + Id +
                ", code=" + code +
                ", sort=" + sort +
                ", type='" + type + '\'' +
                ", explain='" + explain + '\'' +
                '}';
    }
}
