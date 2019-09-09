package com.example.house.dao;

import com.example.house.bean.HouseType;

public interface HouseTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    HouseType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);
}