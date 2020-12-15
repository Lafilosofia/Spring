package com.lhz.login.dao;

import com.lhz.login.entity.User;

/**
 * 持久层接口
 * @author HP
 *
 */
public interface UserDao {
	//根据用户查询用户数据
	User findUserByName(String name);
}
