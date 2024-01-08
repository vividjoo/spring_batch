package com.example.mybatis.dao;

import com.example.mybatis.dto.UserDTO;

import java.util.List;

public interface UserDao {

    public List<UserDTO> findAll();

    public int editById(UserDTO userDTO);

    public int delete(int no);

    public int save(UserDTO userDTO);

}
