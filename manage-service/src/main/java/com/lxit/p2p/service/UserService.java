package com.lxit.p2p.service;

import java.util.List;

import com.lxit.p2p.bean.User;

public interface UserService {
	public List<User> query();
	
	public List<User> queryUserId(int userId);
	
	public int updateUserIndex(User user);

}
