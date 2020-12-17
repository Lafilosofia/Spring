package com.lhz.login.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhz.login.dao.UserDao;
/**
 * ҵ���ʵ�����ø�@Serviceע��
 */
import com.lhz.login.entity.User;

@Service
public class UserServiceImpl implements UserService{
	//ע��־ò�
	@Resource
	private UserDao userDao;
	@Override
	public User checkUserLogin(User user) {
		String name = user.getUserName();
		User u = userDao.findUserByName(name);
		if (u == null) {
			throw new AppException("�û���������");
		}
		//��ȡ���ݿ��е�����
		String dbpwd = u.getUserPassword();
		//��ȡ�û����������
		String pwd = user.getUserPassword();
		if (!dbpwd.equals(pwd)) {
			throw new AppException("�û��������벻��ȷ");
		}
		//��½�ɹ�
		return u;
	}

}
