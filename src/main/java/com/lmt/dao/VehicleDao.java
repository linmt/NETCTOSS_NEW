package com.lmt.dao;

import com.lmt.annotation.MybatisDao;
import com.lmt.entity.Vehicle;

import java.util.List;

/**
 * Created by 热带雨林 on 2018/12/23.
 */
@MybatisDao
public interface VehicleDao {
    List<Vehicle> findAll();
}
