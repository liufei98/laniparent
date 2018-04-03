package com.dx.service;

import com.dx.dao.TbUserMapper;
import com.dx.dto.PageDTO;
import com.dx.pojo.TbUser;
import com.dx.pojo.TbUserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 14571 on 2018/4/3.
 */
@Service
public class UserServiceImpl implements UserService {
    //注入持久层
    @Autowired
    private TbUserMapper tbUserMapper;
    @Autowired
    private HttpServletRequest request;

    @Override
    public int update(TbUser pojo) {
        return 0;
    }

    @Override
    public int addUser(TbUser pojo) {
        return 0;
    }

    @Override
    public int delUser(Long id) {
        return 0;
    }

    @Override
    public List<TbUser> findByName(String name, String currPageBack) {
        PageDTO pageDTO = new PageDTO();
        HttpSession session = request.getSession();
        if(currPageBack!=null){//获取前台传过来的页码
            pageDTO.setCurrPage(Integer.parseInt(currPageBack));
        }
        int rows = pageDTO.getRows();//获取行数
        int currPage = pageDTO.getCurrPage();//获取初始页
        //插入分页
        PageHelper.startPage(currPage,rows);
        //**查询**
        TbUserExample example = new TbUserExample();
        if(!StringUtils.isEmpty(name)){
            TbUserExample.Criteria criteria = example.createCriteria();
            criteria.andUsernameLike("%"+name+"%");
        }
        List<TbUser> list =  tbUserMapper.selectByExample(example);
        //**
        PageInfo pageInfo = new PageInfo(list);//得到总记录数
        long total = pageInfo.getTotal();//获取总记录
        int maxPage = (int)Math.ceil(total*1.0/rows);
        pageDTO.setMaxPage(maxPage);
        session.setAttribute("pageDTO",pageDTO);
        return list;
    }
}
