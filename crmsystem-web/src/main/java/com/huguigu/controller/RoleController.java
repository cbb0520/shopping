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
import java.util.List;
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

    //授权页面  显示角色所有数据  包含子节点的选中状态
    @RequestMapping("/staffrole.action")
    @ResponseBody
    public List<RoLe> staffrole(
            @RequestParam int eid) {
        return roleService.staffrole(eid);
    }

    //角色授予菜单
    @RequestMapping(value = "/addroleMenu.action",produces = "text/json;charset=utf-8")
    @ResponseBody
    public String addroleMenu(int rid,int loginedi,String mids) {

        int shouquan = roleService.addroleMenu(rid,loginedi,mids);
        if (1 > 0) {
            return "恭喜你，授权成功";
        }
        return "授权失败";
    }
    //角色名查询
    @RequestMapping("/queryRname.action")
    @ResponseBody
    public RoLe queryRname(String rname){
        return   roleService.queryRname(rname);
    }
}
