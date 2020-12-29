package com.huguigu.controller;
import com.huguigu.service.Del_goodsService;
import com.huguigu.service.DeliverService;
import com.huguigu.service.Warehouse_goodsService;
import com.huguigu.vo.Del_goods;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Warehouse_goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;

@Controller
@CrossOrigin
public class DeliverController {
    @Autowired
    DeliverService deliverService;
    @Autowired
    Warehouse_goodsService warehouse_goodsService;
    @Autowired
    Del_goodsService del_goodsService;
    @RequestMapping("/queryCountDeliver.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliver(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliver(deliver,page,rows);
    }
    @RequestMapping("/updateDeliverState.action")
    @ResponseBody
    public Map updateDeliverState(int did){
        Map<String,String> map=new HashMap<>();
        int num=deliverService.updateDeliverState(did);
       if(num==1){
        int sum=0;
            List<Del_goods> del_goods=del_goodsService.queryAllDel_goods(did);
            for (Del_goods d:del_goods) {
                List<Warehouse_goods> warehouse_goods= warehouse_goodsService.queryWarehouse_goodsGname(d.getGoods().getGname());
                for (Warehouse_goods w: warehouse_goods) {
                    if(w.getGoods().getGname().equals(d.getGoods().getGname())){
                        sum=w.getCount()-d.getDcount();
                            Warehouse_goods warehouse_goods1=new Warehouse_goods();
                            warehouse_goods1.setWgid(w.getWgid());
                            warehouse_goods1.setCount(sum);
                        warehouse_goodsService.updateWarehouse_goodsCount(warehouse_goods1);
                    }
                }
            }
            map.put("msg","发货成功");
            map.put("code","1");
        }else {
            map.put("msg","发货失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/queryDeliverstate.action")
    @ResponseBody
    public PageVo<Deliver> queryDeliverstate(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryDeliverstate(deliver,page,rows);
    }
    @RequestMapping("/queryCountDeliverdsh.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliverdsh(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliverdsh(deliver,page,rows);
    }
    @RequestMapping("/queryCountDeliverdfh.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliverdfh(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliverdfh(deliver,page,rows);
    }
    @RequestMapping("/updateDeliverStatesh.action")
    @ResponseBody
    public Map updateDeliverStatesh(int did){
        Map<String,String> map=new HashMap<>();
        int num=deliverService.updateDeliverStatesh(did);
        if(num==1){
            map.put("msg","收货成功");
            map.put("code","1");
        }else {
            map.put("msg","收货失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/queryCountDeliverdth.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliverdth(Deliver deliver,
                                                @RequestParam(value = "page",defaultValue ="1") int page,
                                                @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliverdth(deliver,page,rows);
    }
    @RequestMapping("/queryCountDeliveryth.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliveryth(Deliver deliver,
                                                @RequestParam(value = "page",defaultValue ="1") int page,
                                                @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliveryth(deliver,page,rows);
    }
    @RequestMapping("/queryCountDelivers.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDelivers(Deliver deliver,
                                                @RequestParam(value = "page",defaultValue ="1") int page,
                                                @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDelivers(deliver,page,rows);
    }
    @RequestMapping("/querymonthlyincome.action")
    @ResponseBody
    public List<Deliver> querymonthlyincome(String year,int mid) {
        Calendar cal = Calendar.getInstance();
        if (year==null || year == "") {
            year = String.valueOf(cal.get(Calendar.YEAR));
        }
        int month = cal.get(Calendar.MONTH) + 1;
        List<Deliver> querymonthlyincome = deliverService.querymonthlyincome(month,year,mid);
        return querymonthlyincome;
    }
    //查询待付款的订单信息
    @RequestMapping("/queryDaiFuKuan.action")
    @ResponseBody
    public List<Deliver> queryDaiFuKuan(Integer uid) {
        return deliverService.queryDaiFuKuan(uid);
    }

    //将订单改为待提货,修改商品的销量,库存等
    @RequestMapping("/insertDeliverOk.action")
    @ResponseBody
    public void insertDeliverOk() {

        deliverService.deliverPayOk(did);
    }

    //设置一个全局订单id
    public static int did = 0;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    //点击立即付款,生成订单(待付款)
    @RequestMapping("/insertDeliverPay.action")
    @ResponseBody
    public int insertDeliverPay(String uaccount, float price, String text) {
        int id = deliverService.insertDeliver(uaccount,price,text);
        //将返回的订单id设置到全局订单id
        setDid(id);
        return id;
    }
    //查询待付款的订单信息
    @RequestMapping("/queryDaiTiHuo.action")
    @ResponseBody
    public List<Deliver> queryDaiTiHuo(Integer uid) {
        return deliverService.queryDaiTiHuo(uid);
    }

    //查询已完成的订单信息
    @RequestMapping("/queryYiWanCheng.action")
    @ResponseBody
    public List<Deliver> queryYiWanCheng(Integer uid) {
        return deliverService.queryYiWanCheng(uid);
    }

    //用户确认收货
    @RequestMapping("/QueRengShouHuo.action")
    @ResponseBody
    public Map queRengShouHuo(Deliver deliver){
        Map<String,String> map=new HashMap<>();
        int num=deliverService.queRengShouHuo(deliver);
        if(num==1){
            map.put("msg","收货成功");
            map.put("code","1");
        }else {
            map.put("msg","收货失败");
            map.put("code","0");
        }
        return map;
    }

    //用户取消订单
    @RequestMapping("/quXiaoDinDan.action")
    @ResponseBody
    public Map quXiaoDinDan(Integer did){
        Map<String,String> map=new HashMap<>();
        int num=deliverService.quXiaoDinDan(did);
        System.out.println(num);
        if(num!=0){
            map.put("msg","订单取消成功");
            map.put("code","1");
        }else {
            map.put("msg","订单取消失败");
            map.put("code","0");
        }
        return map;
    }

    //用户查看订单详情
    @RequestMapping("/queryDdXq.action")
    @ResponseBody
    public Deliver queryDdXq(Integer did) {
        System.out.println(did);
        return deliverService.queryDdXq(did);
    }
}
