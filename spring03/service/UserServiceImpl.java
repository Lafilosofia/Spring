package com.lhz.login.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhz.login.dao.UserDao;
/**
 * 业务层实现类用该@Service注解
 */
import com.lhz.login.entity.User;

@Service
public class UserServiceImpl implements UserService{
	//注入持久层
	@Resource
	private UserDao userDao;
	@Override
	public User checkUserLogin(User user) {
		String name = user.getUserName();
		User u = userDao.findUserByName(name);
		if (u == null) {
			throw new AppException("用户名不存在");
		}
		//获取数据库中的密码
		String dbpwd = u.getUserPassword();
		//获取用户输入的密码
		String pwd = user.getUserPassword();
		if (!dbpwd.equals(pwd)) {
			throw new AppException("用户名或密码不正确");
		}
		//登陆成功
		return u;
	}

}
