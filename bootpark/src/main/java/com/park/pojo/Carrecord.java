package com.park.pojo;

import java.util.Date;

public class Carrecord {
    private Integer rid;

    private String carnumber;

    private Integer parkprice;

    private Date intime;

    private Date outtime;

    private String position;

    private Integer carstate;

    private String carstatedes;

    private String intimestring;

    private String outtimestring;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public Integer getParkprice() {
        return parkprice;
    }

    public void setParkprice(Integer parkprice) {
        this.parkprice = parkprice;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getCarstate() {
        return carstate;
    }

    public void setCarstate(Integer carstate) {
        this.carstate = carstate;
    }

    public String getCarstatedes() {
        return carstatedes;
    }

    public void setCarstatedes(String carstatedes) {
        this.carstatedes = carstatedes == null ? null : carstatedes.trim();
    }

    public String getIntimestring() {
        return intimestring;
    }

    public void setIntimestring(String intimestring) {
        this.intimestring = intimestring == null ? null : intimestring.trim();
    }

    public String getOuttimestring() {
        return outtimestring;
    }

    public void setOuttimestring(String outtimestring) {
        this.outtimestring = outtimestring == null ? null : outtimestring.trim();
    }
}