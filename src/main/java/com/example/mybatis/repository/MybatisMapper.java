package com.example.mybatis.repository;

import com.example.mybatis.dto.MybatisDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisMapper {
    MybatisDTO mybatisDTO(int i);
}
