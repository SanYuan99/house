package com.example.house.dao;

import com.example.house.bean.Orientation;

import java.util.List;

public interface OrientationDAO {

    List<Orientation> selectListAll();

    int deleteByPrimaryKey(Integer id);

    int insert(Orientation record);

    int insertSelective(Orientation record);

    Orientation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orientation record);

    int updateByPrimaryKey(Orientation record);
}