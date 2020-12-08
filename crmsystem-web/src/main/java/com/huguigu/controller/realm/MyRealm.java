package com.huguigu.controller.realm;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyRealm extends AuthorizingRealm {
   /* @Autowired
    EmployeeService employeeService;
    @Autowired
    RoleService roleService;
    @Autowired
    MenusService menusService;*/


    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //从参数中获取用户名
      /*  AuthenticationToken token= (AuthenticationToken) principals.getPrimaryPrincipal();   //认证时，第一个参数传递的数据

        System.out.println("授权时，取到的用户名："+token.getPrincipal());
        String username = (String) token.getPrincipal();

        //根据用户名查询拥有的角色名(角色id)   userdao.xxxx()
        List<RoLe> accountrole = roleService.accountrole(username);
        List<String> roelss = new ArrayList<String>();
        for (RoLe ro:accountrole) {
            roelss.add(ro.getRname());
        }

        //根据用户名查询菜单code(菜单id)      userdao.xxxx()
        List<Menus> menus = menusService.accountNodetype(username);
        List<String> perms = new ArrayList<String>();
        for (Menus mnuess:menus) {
            perms.add(mnuess.getMenucode());
        }
        //返回权限信息(SimpleAuthorizationInfo)由父类AuthenticatingRealm 进行授权
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roelss);
        authorizationInfo.addStringPermissions(perms);

        return authorizationInfo;*/
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //通过token获取用户名
       /* String username = (String) token.getPrincipal();

        //密码
        //String pwd = (String) token.getCredentials();

        //通过用户名去用户表查询当前用户数据(数据库里面当前用户名对应的密码)
        Employee employee = employeeService.employeeLogin(username);
        System.out.println(employee);
         
        //判断   用户数据为空    当前帐号不存在
                      //不为空   帐号存在
        if(employee==null){
            throw new UnknownAccountException("当前帐号不存在！！！");
        }

        //返回认证信息(SimpleAuthenticationInfo)由父类AuthenticatingRealm 进行认证
        //构造函数三个参数
        //第一个：  token
        //第二个：   帐号对应的数据库密码
        //第三个：  当前realm名字
        SimpleAuthenticationInfo authenticationInfo =
                new SimpleAuthenticationInfo(token,employee.getPassword(),ByteSource.Util.bytes("张三"),this.getName());
        return authenticationInfo;*/
        return null;
    }
}
