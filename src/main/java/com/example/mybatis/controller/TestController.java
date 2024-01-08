package com.example.mybatis.controller;

import com.example.mybatis.dto.ResultDTO;
import com.example.mybatis.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class TestController {
    @CrossOrigin(origins = "http://localhost:8800")
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
        return null;
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
