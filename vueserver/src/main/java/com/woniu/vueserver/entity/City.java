package com.woniu.vueserver.entity;

import java.io.Serializable;
import java.util.List;

public class City implements Serializable {
    private List zones;

    public List getZones() {
        return zones;
    }

    public void setZones(List zones) {
        this.zones = zones;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cid
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cname
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    private String cname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.pid
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    private String pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cid
     *
     * @return the value of city.cid
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cid
     *
     * @param cid the value for city.cid
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cname
     *
     * @return the value of city.cname
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cname
     *
     * @param cname the value for city.cname
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.pid
     *
     * @return the value of city.pid
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.pid
     *
     * @param pid the value for city.pid
     *
     * @mbggenerated Fri May 29 16:07:35 CST 2020
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
}