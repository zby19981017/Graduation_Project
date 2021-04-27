package com.park.pojo;

public class Sysrecord {
    private Integer sysid;

    private Integer mintime;

    private Integer vipprice;

    private Integer usualprice;

    private Integer discount;

    private Integer syscontrol;

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public Integer getMintime() {
        return mintime;
    }

    public void setMintime(Integer mintime) {
        this.mintime = mintime;
    }

    public Integer getVipprice() {
        return vipprice;
    }

    public void setVipprice(Integer vipprice) {
        this.vipprice = vipprice;
    }

    public Integer getUsualprice() {
        return usualprice;
    }

    public void setUsualprice(Integer usualprice) {
        this.usualprice = usualprice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getSyscontrol() {
        return syscontrol;
    }

    public void setSyscontrol(Integer syscontrol) {
        this.syscontrol = syscontrol;
    }
}