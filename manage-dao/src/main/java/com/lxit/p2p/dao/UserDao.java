package com.lxit.p2p.dao;

import java.util.List;

import com.lxit.p2p.bean.User;

/**
 * 用户
 * 
 * @author Administrator
 *
 */
public interface UserDao {

	public List<User> query();

	public List<User> queryUserId(int userId);
	
	public int updateUserIndex(User user);
}
