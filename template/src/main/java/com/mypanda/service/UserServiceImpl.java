package com.mypanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypanda.common.pojo.UsersDataResult;
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
	@Override
	public UsersDataResult getUsersList(int page, int rows) {
		//查询商品列表
		TpUserExample example = new TpUserExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TpUser> list = userMapper.selectByExample(example);
		//创建一个返回值对象
		UsersDataResult result = new UsersDataResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TpUser> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo.getTotal());
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
