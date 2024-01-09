package com.example.mybatis.controller;

import com.example.mybatis.dto.ResultDTO;
import com.example.mybatis.dto.TestDTO;
import com.example.mybatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:8800")
public class DataController {

    @Autowired
    UserService userService;

    @PostMapping("/test")
    public void api(@RequestBody TestDTO hi){
        log.info(hi.toString());
    }

    @GetMapping("/test")
    public String test() {
        log.info("test called !");
        return "test";
    }

    @GetMapping("")
    public String home() {
        log.info("home");
        return "API 전달";
    }

    @PostMapping("/findAll")
    public ResultDTO findAll() {
        log.info("findAll called");

        return userService.findAll();
    }

    @PostMapping("/editById")
    public ResultDTO editById() {
        return null;
    }

    @DeleteMapping("/delete")
    public ResultDTO delete() {
        return null;
    }

    @PutMapping("/save")
    public ResultDTO save() {
        return null;
    }

}
