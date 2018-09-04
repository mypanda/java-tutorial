package com.mypanda.service;

import com.mypanda.common.pojo.UsersDataResult;
import com.mypanda.pojo.TpUser;

public interface UserService {
	public TpUser getUserById(int userId);
	public UsersDataResult getUsersList(int page,int rows);
}
