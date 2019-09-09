package com.example.house.dao;

import com.example.house.bean.HouseMating;

public interface HouseMatingDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseMating record);

    int insertSelective(HouseMating record);

    HouseMating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseMating record);

    int updateByPrimaryKey(HouseMating record);
}