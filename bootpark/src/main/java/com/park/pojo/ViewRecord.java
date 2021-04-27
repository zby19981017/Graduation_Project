package com.park.pojo;

import java.util.Date;

public class ViewRecord {
    private Integer rid;

    private String carnumber;

    private Integer parkprice;

    private Date intime;

    private Date outtime;

    private String position;

    private Integer carstate;

    private String carstatedes;

    private Integer level;

    private String lveldes;

    private Date starttime;

    private Date endtime;

    private String positionname;

    private Integer positionstate;

    private String positionstatedes;

    private Date bstime;

    private Date betime;

    private String starttimestring;

    private String endtimestring;

    private String bstimestring;

    private String betimestring;

    private String intimestring;

    private String outtimestring;

    private Integer frequency;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLveldes() {
        return lveldes;
    }

    public void setLveldes(String lveldes) {
        this.lveldes = lveldes == null ? null : lveldes.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public Integer getPositionstate() {
        return positionstate;
    }

    public void setPositionstate(Integer positionstate) {
        this.positionstate = positionstate;
    }

    public String getPositionstatedes() {
        return positionstatedes;
    }

    public void setPositionstatedes(String positionstatedes) {
        this.positionstatedes = positionstatedes == null ? null : positionstatedes.trim();
    }

    public Date getBstime() {
        return bstime;
    }

    public void setBstime(Date bstime) {
        this.bstime = bstime;
    }

    public Date getBetime() {
        return betime;
    }

    public void setBetime(Date betime) {
        this.betime = betime;
    }

    public String getStarttimestring() {
        return starttimestring;
    }

    public void setStarttimestring(String starttimestring) {
        this.starttimestring = starttimestring == null ? null : starttimestring.trim();
    }

    public String getEndtimestring() {
        return endtimestring;
    }

    public void setEndtimestring(String endtimestring) {
        this.endtimestring = endtimestring == null ? null : endtimestring.trim();
    }

    public String getBstimestring() {
        return bstimestring;
    }

    public void setBstimestring(String bstimestring) {
        this.bstimestring = bstimestring == null ? null : bstimestring.trim();
    }

    public String getBetimestring() {
        return betimestring;
    }

    public void setBetimestring(String betimestring) {
        this.betimestring = betimestring == null ? null : betimestring.trim();
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

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}