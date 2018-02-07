package com.bryantchang.autodepsys.bean;

import java.sql.Timestamp;

public class Cluster {
    private Integer id = null;
    private String cname = null;
    private String desc = null;
    private Timestamp ctime = null;


    public Cluster() {
    }

    public Cluster(Integer id, String cname, String desc, Timestamp ctime) {
        this.id = id;
        this.cname = cname;
        this.desc = desc;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }
}
