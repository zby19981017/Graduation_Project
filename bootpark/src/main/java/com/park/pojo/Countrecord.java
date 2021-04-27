package com.park.pojo;

public class Countrecord {
    private Integer countid;

    private String countcarnumber;

    private Integer countpay;

    private String countlevel;

    private String countyearmonth;

    public Integer getCountid() {
        return countid;
    }

    public void setCountid(Integer countid) {
        this.countid = countid;
    }

    public String getCountcarnumber() {
        return countcarnumber;
    }

    public void setCountcarnumber(String countcarnumber) {
        this.countcarnumber = countcarnumber == null ? null : countcarnumber.trim();
    }

    public Integer getCountpay() {
        return countpay;
    }

    public void setCountpay(Integer countpay) {
        this.countpay = countpay;
    }

    public String getCountlevel() {
        return countlevel;
    }

    public void setCountlevel(String countlevel) {
        this.countlevel = countlevel == null ? null : countlevel.trim();
    }

    public String getCountyearmonth() {
        return countyearmonth;
    }

    public void setCountyearmonth(String countyearmonth) {
        this.countyearmonth = countyearmonth == null ? null : countyearmonth.trim();
    }
}