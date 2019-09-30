package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//获取用户信息
     User getUser(Integer id);
     //指定用户增加积分
     void addScore(Integer id,Integer score);
}
