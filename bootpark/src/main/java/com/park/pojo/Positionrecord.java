package com.park.pojo;

import java.util.Date;

public class Positionrecord {
    private Integer pid;

    private String positionname;

    private Integer positionstate;

    private String positionstatedes;

    private Date bstime;

    private Date betime;

    private String bstimestring;

    private String betimestring;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
}