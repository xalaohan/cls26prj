package com.woniu.cls26prj.service.impl;

import com.woniu.cls26prj.entity.Userinfo;
import com.woniu.cls26prj.mapper.TreeMapper;
import com.woniu.cls26prj.mapper.UserinfoMapper;
import com.woniu.cls26prj.service.ITreeService;
import com.woniu.cls26prj.service.IUserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TreeServiceImpl implements ITreeService {
    @Resource
    private TreeMapper treeMapper;

    @Override
    public List findAll() {
        return treeMapper.selectByExample(null);
    }
}
