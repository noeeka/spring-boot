package com.xiaomao.xiaomao.controller;

import com.xiaomao.xiaomao.mapper.PageMapper;
import com.xiaomao.xiaomao.pojo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class PageControll {
    @Autowired
    PageMapper pageMapper;

    @GetMapping(value = "/page")
    public List<Page> girlList(){
        return pageMapper.findAll();
    }


}
