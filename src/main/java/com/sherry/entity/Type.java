package com.sherry.entity;

/**
 * Created by SherryWong on 2016/11/26.
 */
public class Type {

    private Long sortId;

    private String sortName;

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public String toString() {
        return "Type{" +
                "sortId=" + sortId +
                ", sortName='" + sortName + '\'' +
                '}';
    }

}
