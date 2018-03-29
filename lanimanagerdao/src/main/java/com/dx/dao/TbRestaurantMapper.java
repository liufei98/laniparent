package com.dx.dao;

import com.dx.pojo.TbRestaurant;
import com.dx.pojo.TbRestaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRestaurantMapper {
    int countByExample(TbRestaurantExample example);

    int deleteByExample(TbRestaurantExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(TbRestaurant record);

    int insertSelective(TbRestaurant record);

    List<TbRestaurant> selectByExample(TbRestaurantExample example);

    TbRestaurant selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") TbRestaurant record, @Param("example") TbRestaurantExample example);

    int updateByExample(@Param("record") TbRestaurant record, @Param("example") TbRestaurantExample example);

    int updateByPrimaryKeySelective(TbRestaurant record);

    int updateByPrimaryKey(TbRestaurant record);
}