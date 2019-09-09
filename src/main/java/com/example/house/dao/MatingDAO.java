package com.example.house.dao;

import com.example.house.bean.Mating;

public interface MatingDAO {
    int deleteByPrimaryKey(Integer pid);

    int insert(Mating record);

    int insertSelective(Mating record);

    Mating selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Mating record);

    int updateByPrimaryKey(Mating record);
}