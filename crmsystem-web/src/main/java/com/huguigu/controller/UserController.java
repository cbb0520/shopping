package com.huguigu.controller;

import com.huguigu.controller.pinyin.Pinyin;
import com.huguigu.service.UserService;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

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
                                          @RequestParam(value = "rows",defaultValue = "3")int rows){
        return userService.queryAlluserCount(user,page,rows);
    }

    //前端登录
    @RequestMapping("/loginUser.action")
    @ResponseBody
    @CrossOrigin
    public Map loginUser(User user, HttpSession session){

        Map<String,String> map =new HashMap<String,String>();
        User user1= userService.loginUser(user);

        if(user1!=null){
            session.setAttribute("user",user1);
            map.put("code","0");
            map.put("msg","登录成功");
            map.put("uaccount",user1.getUaccount());
        }else{
            map.put("code","1");
            map.put("msg","登录失败");
        }

        return map;
    }

    //前端注册
    @RequestMapping("/registerUser.action")
    @ResponseBody
    @CrossOrigin
    public Map registerUser(User user, HttpSession session){
        Map<String,String> map =new HashMap<String,String>();
        String uzhanghao=Pinyin.ToPinyin(user.getUname());
        user.setUaccount(uzhanghao);
        User user1=userService.queryByuaccount(user);
        if (user1!=null){
            int id=userService.querymaxuid();
            id++;
            String uzhanghao2=uzhanghao+id;
            user.setUaccount(uzhanghao2);
        }
        int num= userService.registerUser(user);
        if(num!=0){
            session.setAttribute("user",user);
            map.put("code","0");
            map.put("msg","注册成功");
            map.put("uaccount",user.getUaccount());
        }else{
            map.put("code","1");
            map.put("msg","注册失败");
        }

        return map;
    }


}
