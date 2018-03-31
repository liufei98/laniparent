package com.dx.service;

import com.dx.dao.TbSuperUserMapper;
import com.dx.pojo.TbSuperUser;
import com.dx.pojo.TbSuperUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 14571 on 2018/3/30.
 */
@Service
public class SuperUserServiceImpl implements SuperUserService {

    //注入持久层
    @Autowired
    private TbSuperUserMapper tbSuperUserMapper;
    //修改
    @Override
    public int update(TbSuperUser pojo) {
        int i = tbSuperUserMapper.updateByPrimaryKeySelective(pojo);
        return i;
    }
    //添加
    @Override
    public int addUser(TbSuperUser pojo) {
        int i = tbSuperUserMapper.insertSelective(pojo);
        return i;
    }
    //删除
    @Override
    public int delUser(Long id) {
        int i = tbSuperUserMapper.deleteByPrimaryKey(id);
        return i;
    }

    //查询
    @Override
    public List<TbSuperUser> findByName(String name) {

        TbSuperUserExample example = new TbSuperUserExample();
        if(!StringUtils.isEmpty(name)){
            TbSuperUserExample.Criteria criteria = example.createCriteria();
            criteria.andUsernameLike("%"+name+"%");
        }
        List<TbSuperUser> list =  tbSuperUserMapper.selectByExample(example);
        return list;
    }
}
