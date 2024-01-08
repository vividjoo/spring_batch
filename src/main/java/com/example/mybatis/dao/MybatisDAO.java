package com.example.mybatis.dao;

import com.example.mybatis.dto.MybatisDTO;
import com.example.mybatis.repository.MybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MybatisDAO {

    @Autowired
    private MybatisMapper mybatisMapper;

    public List<MybatisDTO> ret(String id) {
        System.out.println("call");
        List<MybatisDTO> mybatisDTO = mybatisMapper.mybatisDTO(id);
        System.out.println("mybatisDTO: "+mybatisDTO.toString());
        return mybatisDTO;
    }


    public boolean searchName(String hashMap) {
        return mybatisMapper.searchName(hashMap);
    }

    public void insertTime(HashMap<String, String> hashMap) {
        mybatisMapper.insertTime(hashMap);
    }

}
