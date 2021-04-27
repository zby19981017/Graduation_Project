package com.park.pojo;

public class Userrecord {
    private Integer userid;

    private String username;

    private String password;

    private Integer level;

    private Integer priceaccess;

    private Integer discountaccess;

    private Integer freeaccess;

    private Integer controlaccess;

    private Integer newsaccess;

    private Integer userstate;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPriceaccess() {
        return priceaccess;
    }

    public void setPriceaccess(Integer priceaccess) {
        this.priceaccess = priceaccess;
    }

    public Integer getDiscountaccess() {
        return discountaccess;
    }

    public void setDiscountaccess(Integer discountaccess) {
        this.discountaccess = discountaccess;
    }

    public Integer getFreeaccess() {
        return freeaccess;
    }

    public void setFreeaccess(Integer freeaccess) {
        this.freeaccess = freeaccess;
    }

    public Integer getControlaccess() {
        return controlaccess;
    }

    public void setControlaccess(Integer controlaccess) {
        this.controlaccess = controlaccess;
    }

    public Integer getNewsaccess() {
        return newsaccess;
    }

    public void setNewsaccess(Integer newsaccess) {
        this.newsaccess = newsaccess;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }
}