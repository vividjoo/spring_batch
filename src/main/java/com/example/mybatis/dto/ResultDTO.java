package com.example.mybatis.dto;

import lombok.Data;

@Data
public class ResultDTO {

    private Boolean state;
    private Object result;

    private String message;

}
