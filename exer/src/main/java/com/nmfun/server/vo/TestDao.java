package com.nmfun.server.vo;

public class TestDao {
    private String id;

    private Integer pw;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPw() {
        return pw;
    }

    public void setPw(Integer pw) {
        this.pw = pw;
    }
}