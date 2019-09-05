package com.iweb.my_order.service.serviceImpl;

import com.iweb.my_order.dao.CommodityDao;
import com.iweb.my_order.entity.Commodity;
import com.iweb.my_order.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityDao commodityDao;
    @Override
    public List<Commodity> queryByName(String name) {
        System.out.println(name);
        return commodityDao.queryByName(name);
    }
    @Override
    public Commodity searchById(Integer id) {
        return commodityDao.queryByPrimarykey(id);
    }
}
