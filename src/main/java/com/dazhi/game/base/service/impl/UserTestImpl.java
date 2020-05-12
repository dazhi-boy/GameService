package com.dazhi.game.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.mapper.UserMapper;
import com.dazhi.game.base.service.UserTest;

@Service
public class UserTestImpl implements UserTest {

	@Resource
	UserMapper userMapper;

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userMapper.selectList(null);
	}

}
