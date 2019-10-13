package com.wangyiyun.factory;

import com.wangyiyun.dao.UserDao;
import com.wangyiyun.dao.impl.UserDaoImpl;

/**
*@ClassName DaoFactory
*@Description  TODO
*@author crj
*Data 
*@Version 1.0
**/
public class DaoFactory {
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }
}
