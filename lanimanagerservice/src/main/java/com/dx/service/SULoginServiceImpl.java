package com.dx.service;

import com.dx.dao.TbSuperUserMapper;
import com.dx.pojo.TbSuperUser;
import com.dx.pojo.TbSuperUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 14571 on 2018/3/30.
 */
@Service
public class SULoginServiceImpl implements SULoginService {
    //注入持久层
    @Autowired
    private TbSuperUserMapper tbSuperUserMapper;
    @Override
    public int searching(String username,String password) {
        List<TbSuperUser> list = tbSuperUserMapper.selectByExample(new TbSuperUserExample());
        for (TbSuperUser superUser : list) {
            if(superUser.getUsername().equals(username)&&superUser.getPassword().equals(password)){
                return 1;
            }
        }
        return -1;
    }
}
