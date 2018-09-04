package com.mypanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mypanda.common.pojo.UsersDataResult;
import com.mypanda.pojo.TpUser;
import com.mypanda.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{userid}")
	@ResponseBody
	public TpUser getUserById(@PathVariable int userid) {
		TpUser tpUser = userService.getUserById(userid);
		return tpUser;
	}
	
	@RequestMapping("/users")
	@ResponseBody
	public UsersDataResult getUsersList(Integer page,Integer rows) {
		UsersDataResult result = userService.getUsersList(page, rows);
		return result;
	}
}
