package com.iweb.my_order.dao;

import com.iweb.my_order.entity.Commodity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityDao {
    List<Commodity> queryByName(String name);

    Commodity queryByPrimarykey(Integer spid);
}
