package com.dx.dao;

import com.dx.pojo.TbPersonal;
import com.dx.pojo.TbPersonalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPersonalMapper {
    int countByExample(TbPersonalExample example);

    int deleteByExample(TbPersonalExample example);

    int deleteByPrimaryKey(Long pId);

    int insert(TbPersonal record);

    int insertSelective(TbPersonal record);

    List<TbPersonal> selectByExample(TbPersonalExample example);

    TbPersonal selectByPrimaryKey(Long pId);

    int updateByExampleSelective(@Param("record") TbPersonal record, @Param("example") TbPersonalExample example);

    int updateByExample(@Param("record") TbPersonal record, @Param("example") TbPersonalExample example);

    int updateByPrimaryKeySelective(TbPersonal record);

    int updateByPrimaryKey(TbPersonal record);
}