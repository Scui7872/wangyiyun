package com.wangyiyun.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.wangyiyun.dao.UserDao;

import java.sql.SQLException;
import java.util.List;

/**
*@ClassName UserDaoImpl
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class UserDaoImpl implements UserDao {


    @Override
    public List<Entity> findAll() throws SQLException {
        return Db.use().query("SELECT * FROM db_wangyiyun.w_user ORDER BY id DESC ");
    }



}