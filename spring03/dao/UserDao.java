package com.lhz.login.dao;

import com.lhz.login.entity.User;

/**
 * �־ò�ӿ�
 * @author HP
 *
 */
public interface UserDao {
	//�����û���ѯ�û�����
	User findUserByName(String name);
}
