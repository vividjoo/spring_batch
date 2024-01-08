package com.example.mybatis.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Slf4j
@RequestMapping("/streaming")
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class StreamingController {

    @PostMapping("/mp3")
//    public ResponseEntity<?> streaming() {
//        log.info("streaming function start");
//        HashMap<String, String> videoUrl = new HashMap<>();
//        videoUrl.put("url", "Saveyourtears");
//        log.info(videoUrl.toString());
//        return null;
//    }
    public String mp3() {
        log.info("mp3 function");
        return "hi";
    }

    @PostMapping("/num")
    public void num(@RequestBody String test) {
        log.info("num "+test.toString());
    }
}
