package com.lhz.login.service;

import com.lhz.login.entity.User;

/**
 * 业务层接口
 * @author HP
 *
 */
public interface UserService {
	//校验用户是否成功
	User checkUserLogin(User user);
}
