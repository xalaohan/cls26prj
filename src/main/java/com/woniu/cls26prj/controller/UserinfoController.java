package com.woniu.cls26prj.controller;

import com.woniu.cls26prj.entity.Userinfo;
import com.woniu.cls26prj.service.IRoleService;
import com.woniu.cls26prj.service.IUserinfoService;
import org.apache.ibatis.session.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/admin/userinfo/")
@RestController
public class UserinfoController {
    @Resource
    private IUserinfoService userinfoServiceImpl;
    @Resource
    private IRoleService roleServiceImpl;

    @PostMapping("save")
    public void save(Userinfo info, String rids){
        userinfoServiceImpl.save(info, rids);
    }

    @PostMapping("update")
    public void update(Userinfo info, String rids){
        userinfoServiceImpl.save(info, rids);
    }

    @GetMapping("findAll")
    public List findAll(){
        return userinfoServiceImpl.findAll();
    }

    @GetMapping("findById")
    public Userinfo findAll(int uid){
        return userinfoServiceImpl.findById(uid);
    }

    @GetMapping("findRoles")
    public List findRoles(){
        return roleServiceImpl.findAll();
    }
}
