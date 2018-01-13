package com.lxit.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.p2p.bean.User;
import com.lxit.p2p.dao.UserDao;
import com.lxit.p2p.service.UserService;

@Service
@MapperScan("com.lxit.p2p.dao")
public class UserServiceImpl implements UserService {

	@Resource
	UserDao userDao;

	@Override
	public List<User> query() {
		return userDao.query();
	}

	@Override
	public List<User> queryUserId(int userId) {
		return userDao.queryUserId(userId);
	}

	@Override
	public int updateUserIndex(User user) {
		return userDao.updateUserIndex(user);
	}

}
