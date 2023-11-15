package com.example.mybatis.dao;

import com.example.mybatis.dto.MybatisDTO;
import com.example.mybatis.repository.MybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisDAO {

    @Autowired
    private MybatisMapper mybatisMapper;

    public void ret(int i) {
        System.out.println("call");
        MybatisDTO mybatisDTO = mybatisMapper.mybatisDTO(i);
        System.out.println("mybatisDTO: "+mybatisDTO.toString());
    }

}
