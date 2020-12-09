package com.huguigu.vo;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int id;
    private String text;
    private String url;
    private String iconCls;
    private int parentid;
    private String menucode;
    private int nodetype ;
    //子菜单集合
    private List<Menu> children=new ArrayList<Menu>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public int getNodetype() {
        return nodetype;
    }

    public void setNodetype(int nodetype) {
        this.nodetype = nodetype;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Menu(int id, String text, String url, String iconCls, int parentid, String menucode, int nodetype, List<Menu> children) {
        this.id = id;
        this.text = text;
        this.url = url;
        this.iconCls = iconCls;
        this.parentid = parentid;
        this.menucode = menucode;
        this.nodetype = nodetype;
        this.children = children;
    }

    public Menu() {
        super();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", parentid=" + parentid +
                ", menucode='" + menucode + '\'' +
                ", nodetype=" + nodetype +
                ", children=" + children +
                '}';
    }
}
