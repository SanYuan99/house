package com.example.house.dao;

import com.example.house.bean.HouseImg;

public interface HouseImgDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseImg record);

    int insertSelective(HouseImg record);

    HouseImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseImg record);

    int updateByPrimaryKey(HouseImg record);
}