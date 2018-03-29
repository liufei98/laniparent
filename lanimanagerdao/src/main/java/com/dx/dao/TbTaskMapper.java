package com.dx.dao;

import com.dx.pojo.TbTask;
import com.dx.pojo.TbTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTaskMapper {
    int countByExample(TbTaskExample example);

    int deleteByExample(TbTaskExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TbTask record);

    int insertSelective(TbTask record);

    List<TbTask> selectByExampleWithBLOBs(TbTaskExample example);

    List<TbTask> selectByExample(TbTaskExample example);

    TbTask selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TbTask record, @Param("example") TbTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTask record, @Param("example") TbTaskExample example);

    int updateByExample(@Param("record") TbTask record, @Param("example") TbTaskExample example);

    int updateByPrimaryKeySelective(TbTask record);

    int updateByPrimaryKeyWithBLOBs(TbTask record);

    int updateByPrimaryKey(TbTask record);
}