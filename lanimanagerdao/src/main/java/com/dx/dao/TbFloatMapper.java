package com.dx.dao;

import com.dx.pojo.TbFloat;
import com.dx.pojo.TbFloatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFloatMapper {
    int countByExample(TbFloatExample example);

    int deleteByExample(TbFloatExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(TbFloat record);

    int insertSelective(TbFloat record);

    List<TbFloat> selectByExample(TbFloatExample example);

    TbFloat selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") TbFloat record, @Param("example") TbFloatExample example);

    int updateByExample(@Param("record") TbFloat record, @Param("example") TbFloatExample example);

    int updateByPrimaryKeySelective(TbFloat record);

    int updateByPrimaryKey(TbFloat record);
}