package com.huguigu.controller;

import com.huguigu.service.StaffService;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(value ="/staffLogin.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public  Staff  staffLogin(Staff staff,  HttpSession session) {
        Staff staff1 = staffService.staffLogin(staff.getAccount());
        if(staff1 !=null){
            return staff1;
        }

        return null;
    }
    @RequestMapping("/queryStaff.action")
    @ResponseBody
    @CrossOrigin
    public PageVo<Staff> queryEmployee(Staff staff,
                                       @RequestParam(value = "page",defaultValue = "1")int page,
                                       @RequestParam(value = "rows",defaultValue = "5")int rows
    ){
        return staffService.queryStaffbyCond(staff,page,rows);
    }

    @RequestMapping("/deleStaff.action")
    @ResponseBody
    @CrossOrigin
    public Map deleStaff(Integer eid){
        int i = staffService.deleStaff(eid);
        Map<String,String> map =new HashMap<String,String>();
        if(i>0) {
            map.put("msg", "恭喜你，删除成功");
        }
        return map;
    }

    @RequestMapping( value ="/addStaff.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String  addStaff(Staff staff) {
        int i = staffService.addStaff(staff);
        if (i > 0) {

            return "恭喜你，添加成功";
        }
        return "添加失败";
    }

    @RequestMapping("/queryByeId.action")
    @ResponseBody
    public Staff queryByeId(int eid){
        return   staffService.queryByeId(eid);
    }

    @RequestMapping( value ="/updateStaff.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String  updateStaff(Staff staff) {

        int i = staffService.updateStaff(staff);
        if (i > 0) {

            return "恭喜你，编辑成功";
        }
        return "编辑失败";
    }
}
