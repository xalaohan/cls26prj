package com.woniu.cls26prj.entity;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rid
     *
     * @mbggenerated Wed May 27 10:18:18 CST 2020
     */
    private Integer rid;

    @Override
    public String toString() {
        return rolename;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rolename
     *
     * @mbggenerated Wed May 27 10:18:18 CST 2020
     */
    private String rolename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rid
     *
     * @return the value of role.rid
     *
     * @mbggenerated Wed May 27 10:18:18 CST 2020
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rid
     *
     * @param rid the value for role.rid
     *
     * @mbggenerated Wed May 27 10:18:18 CST 2020
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rolename
     *
     * @return the value of role.rolename
     *
     * @mbggenerated Wed May 27 10:18:18 CST 2020
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rolename
     *
     * @param rolename the value for role.rolename
     *
     * @mbggenerated Wed May 27 10:18:18 CST 2020
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}