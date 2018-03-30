package com.dx.service;

import com.dx.pojo.TbSuperUser;

import java.util.List;

/**
 * Created by 14571 on 2018/3/30.
 */
public interface SuperUserService {

    //修改
    public int update(TbSuperUser pojo);

    //添加
    public int addUser(TbSuperUser pojo);

    //删除
    public int delUser(Long id);

    //查询
    public List<TbSuperUser> findByName(String name);
}
