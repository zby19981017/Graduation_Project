package com.park.pojo;

public class Moneyrecord {
    private String yearmonth;

    private Integer money;

    public String getYearmonth() {
        return yearmonth;
    }

    public void setYearmonth(String yearmonth) {
        this.yearmonth = yearmonth == null ? null : yearmonth.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}