package com.huguigu.controller;

import com.huguigu.service.ClassifyService;
import com.huguigu.vo.Classify;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ClassifyController {
    @Autowired
    ClassifyService classifyService;

    @RequestMapping("queryALlClassify.action")
    public PageVo<Classify> queryALlClassify(Classify c,
                                             @RequestParam(value = "page", defaultValue = "1") int page,
                                             @RequestParam(value = "rows", defaultValue = "5") int rows){
        return classifyService.queryAllClassify(c,page,rows);
    }

    @RequestMapping("delclasifyById.action")
    public Map<String, String> delclasifyById(int fid){
        Map<String,String> map =new HashMap<String,String>();
        int i = classifyService.delClassifyById(fid);
        if (i < 0) {
            map.put("msg","删除失败");
            map.put("type","error");
        }
        if (i == 1) {
            map.put("msg","删除成功");
            map.put("type","success");
        }
        return map;
    }

    @RequestMapping("queryClassifyById.action")
    public Classify queryClassifyById(int fid){
        return classifyService.queryClassifyById(fid);
    }

    @RequestMapping("uptClassify.action")
    public Map uptClassify(Classify classify,String oldfname){
        Map<String,String> map =new HashMap<String,String>();
        int i = classifyService.uptClassify(classify,oldfname);
        if (i < 1) {
            map.put("msg","修改失败");
            map.put("type","error");
        }
        if (i == 1) {
            map.put("msg","修改成功");
            map.put("type","success");
        }
        if(i == 2){
            map.put("msg","修改失败，该名称已经在使用！");
            map.put("type","info");
        }
        return map;
    }

    @RequestMapping("addClassify.action")
    public Map addClassify(Classify classify){
        Map<String,String> map =new HashMap<String,String>();
        int i = classifyService.addCLassify(classify);
        if (i < 1) {
            map.put("msg","添加失败");
            map.put("type","error");
        }
        if (i == 1) {
            map.put("msg","添加成功");
            map.put("type","success");
        }
        if(i == 2){
            map.put("msg","修改失败，该名称已经在使用！");
            map.put("type","info");
        }
        return map;
    }
}
