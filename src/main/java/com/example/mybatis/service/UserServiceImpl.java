package com.example.mybatis.service;

import com.example.mybatis.dao.UserDao;
import com.example.mybatis.dto.ResultDTO;
import com.example.mybatis.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {


    private ResultDTO resultDTO;

    @Autowired
    UserDao userDao;

    @Override
    public ResultDTO findAll() {
        resultDTO = new ResultDTO();
        log.info("imple");
        List<UserDTO> resultList = userDao.findAll();

        if(resultList != null){
            resultDTO.setState(true);
            resultDTO.setResult(resultList);
        }else{
            resultDTO.setState(false);
        }

        return resultDTO;
    }

    @Override
    public ResultDTO editById(UserDTO userDTO) {
        return null;
    }

    @Override
    public ResultDTO delete(int no) {
        return null;
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {
        return null;
    }
}
