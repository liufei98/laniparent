package com.dx.action;

import com.dx.service.SULoginService;
import com.dx.service.SuperUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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

    //登录
}
