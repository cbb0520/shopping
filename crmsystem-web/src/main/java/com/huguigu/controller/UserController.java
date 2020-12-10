package com.huguigu.controller;

import com.huguigu.service.UserService;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    //查询所有用户信息
    @RequestMapping("/queryAlluserCount.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<User> queryAlluserCount(User user,
                                          @RequestParam(value = "page",defaultValue = "1") int page,
                                          @RequestParam(value = "rows",defaultValue = "5")int rows){
        return userService.queryAlluserCount(user,page,rows);
    }

}
