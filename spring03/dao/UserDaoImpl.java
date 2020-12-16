package com.lhz.login.dao;

import java.security.spec.DSAGenParameterSpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.lhz.login.entity.User;

/**
 * 数据访问层实现类
 *  @Reposiory(持久化)数据访问层应该使用该注解用于组件扫描
 * @author HP
 *
 */
@Repository
public class UserDaoImpl implements UserDao{
	//注入连接池
	/*
	 * @Resource
	 */
	@Resource
	private DataSource dataSouce;
	
	@Override
	public User findUserByName(String name) {
		User user = null;
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSouce.getConnection();
			String sql = "select * from user where user_name = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				user = new User();
				user.setId(resultSet.getInt("id"));
				user.setUserName(resultSet.getString("user_name"));
				user.setUserPassword(resultSet.getString("user_password"));
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				connection.close();
				resultSet.close();
				preparedStatement.close();
			} catch (Exception e2) {
				// TODO: handle except
			}
		}
		return null;
	}

}
