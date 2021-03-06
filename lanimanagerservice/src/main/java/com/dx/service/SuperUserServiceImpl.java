package com.dx.service;

import com.dx.dao.TbSuperUserMapper;
import com.dx.dto.PageDTO;
import com.dx.pojo.TbSuperUser;
import com.dx.pojo.TbSuperUserExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.text.html.HTML.Tag.P;

/**
 * Created by 14571 on 2018/3/30.
 */
@Service
public class SuperUserServiceImpl implements SuperUserService {

    //注入持久层
    @Autowired
    private TbSuperUserMapper tbSuperUserMapper;
    @Autowired
    private HttpServletRequest request;
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
    public List<TbSuperUser> findByName(String name,String currPageBack) {
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
        TbSuperUserExample example = new TbSuperUserExample();
        if(!StringUtils.isEmpty(name)){
            TbSuperUserExample.Criteria criteria = example.createCriteria();
            criteria.andUsernameLike("%"+name+"%");
        }
        List<TbSuperUser> list =  tbSuperUserMapper.selectByExample(example);
        //**
        PageInfo pageInfo = new PageInfo(list);//得到总记录数
        long total = pageInfo.getTotal();//获取总记录
        int maxPage = (int)Math.ceil(total*1.0/rows);
        pageDTO.setMaxPage(maxPage);
        session.setAttribute("pageDTO",pageDTO);
        return list;
    }
}
