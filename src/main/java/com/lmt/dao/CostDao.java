package com.lmt.dao;

import com.lmt.annotation.MybatisDao;
import com.lmt.entity.Cost;
import com.lmt.entity.CostSimple;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/1.
 */
@MybatisDao
public interface CostDao {
    void save(Cost cost);
    List<Cost> findAll();
    List<Cost> findByPage(HashMap map);
    int findTotalPage(int pageSize);
    List<CostSimple> findAllCostSimple();
}
