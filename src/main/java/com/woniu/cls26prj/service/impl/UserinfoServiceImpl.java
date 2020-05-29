package com.woniu.cls26prj.service.impl;

import com.woniu.cls26prj.entity.Userinfo;
import com.woniu.cls26prj.entity.UserinforoleExample;
import com.woniu.cls26prj.entity.UserinforoleKey;
import com.woniu.cls26prj.mapper.RoleMapper;
import com.woniu.cls26prj.mapper.UserinfoMapper;
import com.woniu.cls26prj.mapper.UserinforoleMapper;
import com.woniu.cls26prj.service.IUserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
    @Resource
    private UserinfoMapper userinfoMapper;
    @Resource
    private UserinforoleMapper userinforoleMapper;
    @Override
    public Userinfo findByUname(String uname) {
        return userinfoMapper.findByUname(uname);
    }

    @Override
    public void save(Userinfo info, String rids) {
        userinfoMapper.insert(info);
        String[] ridsarr = rids.split(",");
        for (int i = 0; i < ridsarr.length; i++) {
            String rid = ridsarr[i];
            UserinforoleKey key = new UserinforoleKey();
            key.setUid(info.getUid());
            key.setRid(Integer.parseInt(rid));
            userinforoleMapper.insert(key);
        }
    }
    @Override
    public void update(Userinfo info, String rids) {
        userinfoMapper.updateByPrimaryKey(info);

        UserinforoleExample example = new UserinforoleExample();
        example.createCriteria().andUidEqualTo(info.getUid());
        userinforoleMapper.deleteByExample(example);

        String[] ridsarr = rids.split(",");
        for (int i = 0; i < ridsarr.length; i++) {
            String rid = ridsarr[i];
            UserinforoleKey key = new UserinforoleKey();
            key.setUid(info.getUid());
            key.setRid(Integer.parseInt(rid));
            userinforoleMapper.insert(key);
        }
    }

    @Override
    public Userinfo findById(Integer uid) {
        return userinfoMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List findAll() {
        return userinfoMapper.selectByExample(null);
    }
}
