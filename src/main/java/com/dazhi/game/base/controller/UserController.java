package com.dazhi.game.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.service.UserService;
import com.dazhi.game.common.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(value = "/user", tags = "UserController", description = "用户管理接口")
public class UserController {
	@Autowired
	UserService userService;
	
	@ApiOperation(value = "更新用户")
	@PostMapping("/add")
	public Result save(User user) {
		// user.setId(5L);
		// user.setVersion(2);
		// user.setFlag(false);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		userService.save(user);
		return Result.ok("OK");
	}

	@ApiOperation(value = "通过id获取指定用户")
	@GetMapping("/{id}")
	public Result<User> get(@PathVariable("id") Long id) {
		User user = userService.getById(id);
		Result<User> result = Result.ok("OK");
		result.setData(user);
		return result;
	}
}
