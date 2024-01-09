package com.example.mybatis.dao;

import com.example.mybatis.dto.ResultDTO;
import com.example.mybatis.dto.UserDTO;
import com.example.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class UserDaoImpl implements UserDao{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserDTO> findAll() {
        log.info("user Imple");
        return userMapper.findAll();
    }

    @Override
    public int editById(UserDTO userDTO) {
        return 0;
    }

    @Override
    public int delete(int no) {
        return 0;
    }

    @Override
    public int save(UserDTO userDTO) {
        return 0;
    }
}
