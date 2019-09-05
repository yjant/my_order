package com.iweb.my_order.service;

import com.iweb.my_order.entity.Commodity;

import java.util.List;

public interface CommodityService {
    List<Commodity> queryByName(String name);

    Commodity searchById(Integer id);
}
