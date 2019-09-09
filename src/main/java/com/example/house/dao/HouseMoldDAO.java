package com.example.house.dao;

import com.example.house.bean.HouseMold;

public interface HouseMoldDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseMold record);

    int insertSelective(HouseMold record);

    HouseMold selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseMold record);

    int updateByPrimaryKey(HouseMold record);
}