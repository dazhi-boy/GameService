package com.dazhi.game.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.service.IUserService;
import com.dazhi.game.common.BaseController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/base/user")
@Api(value = "/base/user", tags = "UserController", description = "用户管理接口")
public class UserController extends BaseController<User> {

	@Autowired
	public void setiService(IUserService userService) {
		super.setiService(userService);
	}
}
