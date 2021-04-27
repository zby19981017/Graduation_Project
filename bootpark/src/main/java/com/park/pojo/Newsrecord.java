package com.park.pojo;

import java.util.Date;

public class Newsrecord {
    private Integer newsid;

    private String title;

    private String message;

    private Date creattime;

    private Date finishtime;

    private Integer newsstate;

    private String creattimestring;

    private String finishtimestring;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Integer getNewsstate() {
        return newsstate;
    }

    public void setNewsstate(Integer newsstate) {
        this.newsstate = newsstate;
    }

    public String getCreattimestring() {
        return creattimestring;
    }

    public void setCreattimestring(String creattimestring) {
        this.creattimestring = creattimestring == null ? null : creattimestring.trim();
    }

    public String getFinishtimestring() {
        return finishtimestring;
    }

    public void setFinishtimestring(String finishtimestring) {
        this.finishtimestring = finishtimestring == null ? null : finishtimestring.trim();
    }
}