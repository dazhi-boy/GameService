package com.dazhi.game.base.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.mapper.UserMapper;
import com.dazhi.game.base.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
