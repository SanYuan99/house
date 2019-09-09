package com.example.house.dao;

import com.example.house.bean.HouseInformation;

public interface HouseInformationDAO {
    int deleteByPrimaryKey(Integer houseId);

    int insert(HouseInformation record);

    int insertSelective(HouseInformation record);

    HouseInformation selectByPrimaryKey(Integer houseId);

    int updateByPrimaryKeySelective(HouseInformation record);

    int updateByPrimaryKey(HouseInformation record);
}