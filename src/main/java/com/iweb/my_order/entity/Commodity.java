package com.iweb.my_order.entity;

import org.springframework.stereotype.Component;

@Component
public class Commodity {
    private Integer spid;
    private String name;
    private String descri;
    private String imgpath;
    private Double price;
    private Integer count;

    public Commodity() {

    }

    public Commodity(String name, String descri, String imgpath, Double privce, Integer count) {
        this.name = name;
        this.descri = descri;
        this.imgpath = imgpath;
        this.price = privce;
        this.count = count;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CommodityService{" +
                "spid=" + spid +
                ", name='" + name + '\'' +
                ", descri='" + descri + '\'' +
                ", imgpath='" + imgpath + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
