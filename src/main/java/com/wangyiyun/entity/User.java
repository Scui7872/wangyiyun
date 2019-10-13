package com.wangyiyun.entity;


import lombok.Data;

import java.time.LocalDate;

/**
*@ClassName User
*@Description  用户实体类
*@author crj
*Data 
*@Version 1.0
**/
@Data
public class User {
    private Integer id;
    private String account;
    private String password;
    private String avatar;
    private String nickname;
    private String address;
    private LocalDate joinDate;
    private String description;


}
