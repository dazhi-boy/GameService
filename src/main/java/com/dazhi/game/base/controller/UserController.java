package com.dazhi.game.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.service.UserService;
import com.dazhi.game.common.Result;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("user")
	public Result save() {
		User user = new User();
		// user.setId(5L);
		user.setVersion(2);
		user.setFlag(false);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		userService.save(user);
		return Result.ok("OK");
	}
}
