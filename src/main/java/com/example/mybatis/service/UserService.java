package com.example.mybatis.service;


import com.example.mybatis.dto.ResultDTO;
import com.example.mybatis.dto.UserDTO;
import org.bouncycastle.asn1.esf.SPuri;

public interface UserService {

    public ResultDTO findAll();

    public ResultDTO editById(UserDTO userDTO);

    public ResultDTO delete(int no);

    public ResultDTO save(UserDTO userDTO);





}
