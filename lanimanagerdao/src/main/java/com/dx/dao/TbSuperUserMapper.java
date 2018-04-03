package com.dx.dao;

import com.dx.pojo.TbSuperUser;
import com.dx.pojo.TbSuperUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSuperUserMapper {
    int countByExample(TbSuperUserExample example);

    int deleteByExample(TbSuperUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSuperUser record);

    int insertSelective(TbSuperUser record);

    List<TbSuperUser> selectByExample(TbSuperUserExample example);

    TbSuperUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSuperUser record, @Param("example") TbSuperUserExample example);

    int updateByExample(@Param("record") TbSuperUser record, @Param("example") TbSuperUserExample example);

    int updateByPrimaryKeySelective(TbSuperUser record);

    int updateByPrimaryKey(TbSuperUser record);
}