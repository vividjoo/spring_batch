package com.example.mybatis.repository;

import com.example.mybatis.dto.MybatisDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface MybatisMapper {
    List<MybatisDTO> mybatisDTO(String id);

    boolean searchName(String hashMap);

    void insertTime(HashMap<String, String> hashMap);
}
