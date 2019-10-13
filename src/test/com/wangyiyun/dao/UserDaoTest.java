package com.wangyiyun.dao;

import cn.hutool.db.Entity;
import com.wangyiyun.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
*@ClassName UserDaoTest
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class UserDaoTest {
    private UserDao userDao = DaoFactory.getUserDaoInstance();

    @Test
    public void findAll() {
        List<Entity> entityList = null;
        try {
            entityList = userDao.findAll();
        } catch (SQLException e) {
            System.out.println("查询用户数据信息出现异常");
        }
        if (entityList != null) {
            entityList.forEach(entity -> System.out.println(entity.get("nickname")));
        }else {
            System.out.println("没有数据");
        }
    }
}
