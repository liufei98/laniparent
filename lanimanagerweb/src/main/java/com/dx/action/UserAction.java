package com.dx.action;

import com.dx.pojo.TbUser;
import com.dx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 14571 on 2018/4/3.
 */
@Controller
public class UserAction {
    //注入服务层
    @Autowired
    private UserService userService;

    //列表(主)
    @RequestMapping("/admin/ulist")
    public ModelAndView findAll(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String username = request.getParameter("uname");
        String currPage = request.getParameter("currPage");
        List<TbUser> list = userService.findByName(username,currPage);
        mv.addObject("uList",list);
        mv.setViewName("admin/user");
        return mv;
    }
}
