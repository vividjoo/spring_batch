package com.example.mybatis.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class UserDTO {

    private int no;
    private String name;
    private String email;
    private String pwd;
    private boolean gender;
    private boolean del;
    private LocalDate regDate;



}
