package com.mypanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypanda.mapper.TpUserMapper;
import com.mypanda.pojo.TpUser;
import com.mypanda.pojo.TpUserExample;
import com.mypanda.pojo.TpUserExample.Criteria;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TpUserMapper userMapper;
	@Override
	public TpUser getUserById(int userId) {
		
		// userMapper.selectByPrimaryKey(userId);
		TpUserExample example = new TpUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(userId);
		
		List<TpUser> list = (List<TpUser>) userMapper.selectByExample(example);
		
		if(list != null && list.size() > 0) {
			TpUser user = list.get(0);
			return user;
		}
		return null;
	}

}
