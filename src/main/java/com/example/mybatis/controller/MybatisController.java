package com.example.mybatis.controller;

import com.example.mybatis.dao.MybatisDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

    @Autowired
    private MybatisDAO dao;

    @GetMapping("hi")
    public String hi(@RequestParam int i) {
        dao.ret(i);
        return "zzzz";
    }
}
