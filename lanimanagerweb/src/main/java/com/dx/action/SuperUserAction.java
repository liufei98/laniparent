package com.dx.action;

import com.dx.service.SULoginService;
import com.dx.service.SuperUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Created by 14571 on 2018/3/30.
 */
@Controller
public class SuperUserAction {

    //注入服务层
    @Autowired
    private SULoginService suLoginService;
    @Autowired
    private SuperUserService superUserService;

    //登录判断

    @RequestMapping("/back/login")
    public ModelAndView login(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        //获取用户名密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //跟数据库进行比较
        int i = suLoginService.searching(username, password);
        if(i>0){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            System.out.println("登录成功");
            return mv;
        }else if (i<0){
            System.out.println("登录失败");
            return mv;
        }
        return null;
    }
}
