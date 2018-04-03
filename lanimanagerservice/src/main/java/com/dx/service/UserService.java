package com.dx.service;

import com.dx.pojo.TbUser;

import java.util.List;

/**
 * Created by 14571 on 2018/4/3.
 */
public interface UserService {
    //修改
    public int update(TbUser pojo);

    //添加
    public int addUser(TbUser pojo);

    //删除
    public int delUser(Long id);

    //查询
    public List<TbUser> findByName(String name, String currPageBack);
}
