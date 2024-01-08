package com.example.mybatis.dao;

import com.example.mybatis.dto.ResultDTO;
import com.example.mybatis.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    private ResultDTO resultDTO;

    @Autowired
    UserDao userDao;

    @Override
    public List<UserDTO> findAll() {
        resultDTO = new ResultDTO();
        List<UserDTO> resultList = userDao.findAll();
        if(resultList != null){
            resultDTO.setState(true);
            resultDTO.setResult(resultList);
        }else{
            resultDTO.setState(false);
        }


        return null;
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
