package com.woniu.cls26prj.service;

import com.woniu.cls26prj.entity.Userinfo;

import java.util.List;

public interface IUserinfoService {
    Userinfo findByUname(String uname);

    void save(Userinfo info,String rids);
    void update(Userinfo info,String rids);
    Userinfo findById(Integer uid);
    List findAll();
}
