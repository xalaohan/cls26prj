package com.woniu.vueserver.controller;

import com.woniu.vueserver.entity.Userinfo;
import com.woniu.vueserver.mapper.UserinfoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserinfoController {
    @Resource
    private UserinfoMapper userinfoMapper;

    @GetMapping("/findAll")
    public List findAll(){
        return userinfoMapper.selectByExample(null);
    }
    @PostMapping("/save")
    public void save(Userinfo info){
        userinfoMapper.insert(info);
    }
    @PostMapping("/update")
    public void update(Userinfo info){
        userinfoMapper.updateByPrimaryKey(info);
    }
    @GetMapping("/delete")
    public void delete(Integer uid){
        userinfoMapper.deleteByPrimaryKey(uid);
    }
    @GetMapping("/findById")
    public Userinfo findByUid(Integer uid){
        return userinfoMapper.selectByPrimaryKey(uid);
    }
}
