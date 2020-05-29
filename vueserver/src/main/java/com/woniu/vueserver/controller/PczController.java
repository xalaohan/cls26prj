package com.woniu.vueserver.controller;

import com.woniu.vueserver.mapper.ProvinceMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PczController {
    @Resource
    private ProvinceMapper provinceMapper;
    @GetMapping("/provinces")
    public List provinces(){
        return provinceMapper.selectByExample(null);
    }
}
