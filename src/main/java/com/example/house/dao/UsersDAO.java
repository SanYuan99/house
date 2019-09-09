package com.example.house.dao;

import com.example.house.bean.Users;

import java.util.List;

public interface UsersDAO {

    List<Users> listAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}