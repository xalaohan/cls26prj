package com.woniu.cls26prj.service.impl;

import com.woniu.cls26prj.mapper.RoleMapper;
import com.woniu.cls26prj.mapper.TreeMapper;
import com.woniu.cls26prj.service.IRoleService;
import com.woniu.cls26prj.service.ITreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    private RoleMapper roleMapper;

    public List findAll() {
        return roleMapper.selectByExample(null);
    }
}
