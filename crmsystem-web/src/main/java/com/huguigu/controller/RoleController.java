package com.huguigu.controller;

import com.huguigu.service.RoleService;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.RoLe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class RoleController {
    @Autowired
    RoleService roleService;
    @RequestMapping("/queryRoLe.action")
    @ResponseBody
    public PageVo<RoLe> queryRoLebyCond(RoLe roLe,
                                        @RequestParam(value = "page",defaultValue = "1")int page,
                                        @RequestParam(value = "rows",defaultValue = "4")int rows
    ){
        return roleService.queryRoLebyCond(roLe,page,rows);
    }

    @RequestMapping("/deleRoLe.action")
    @ResponseBody
    public Map deleRoLe(Integer rid){

        Map<String,String> map =new HashMap<String,String>();//split  -->[
        roleService.deleRoLe(rid);
        map.put("msg","删除成功");
        return map;
    }

    @RequestMapping( value ="/addRoLe.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String  addRoLe(RoLe roLe) {

        int i = roleService.addRoLe(roLe);
        if (i > 0) {

            return "恭喜你，添加成功";
        }
        return "添加失败";
    }

    @RequestMapping("/roleByrId.action")
    @ResponseBody
    public RoLe queryByrId(int rid){
        return   roleService.queryByrId(rid);
    }

    @RequestMapping( value ="/updateRoLe.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String  updateRoLe(RoLe roLe) {
        int i = roleService.updateRoLe(roLe);
        if (i > 0) {

            return "恭喜你，编辑成功";
        }
        return "编辑失败";
    }
}
