package com.huguigu.controller;
import com.huguigu.controller.pinyin.Pinyin;
import com.huguigu.service.UserService;
import com.huguigu.vo.Merchants;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
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
                                          @RequestParam(value = "rows",defaultValue = "10")int rows){
        return userService.queryAlluserCount(user,page,rows);
    }

    //前端登录
    @RequestMapping("/loginUser.action")
    @ResponseBody
    @CrossOrigin
    public Map loginUser(User user, HttpSession session){

        System.out.println(user);
        Map<String,String> map =new HashMap<String,String>();
        User user1= userService.loginUser(user);

        if(user1!=null){
            session.setAttribute("user",user1);
            map.put("code","0");
            map.put("msg","登录成功");
            map.put("uaccount",user1.getUaccount());
            map.put("uid",String.valueOf(user1.getUid()));
            map.put("uimg",user1.getUimg());
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
    //修改头像
    @RequestMapping("/uplodauimgByuaccount.action")
    @ResponseBody
    @CrossOrigin
    public Map uplodauimgByuaccount(User user,
                            @RequestParam("img") MultipartFile img) throws IOException {
        user.setUimg(img.getOriginalFilename());  //保存到数据库的【相对路径】
        //将上传的文件保存到服务器上的前端项目的【绝对路径】
        img.transferTo(new File("D:\\ideaIU-xm\\shopping_vue2\\images\\"+img.getOriginalFilename()));
        Map<String,String> map=new HashMap<>();
        int num=userService.uplodauimgByuaccount(user);
        if(num==1){
            map.put("code","1");
        }else {
            map.put("code","0");
        }
        return map;
    }

    //根据账号查询用户
    @RequestMapping("/queryByuaccount.action")
    @ResponseBody
    @CrossOrigin
    public User queryByuaccount(User user){
        System.out.println(user);
        return userService.queryByuaccount(user);
    }


}
