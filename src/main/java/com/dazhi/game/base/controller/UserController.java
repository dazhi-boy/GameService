package com.dazhi.game.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.service.UserService;
import com.dazhi.game.common.Result;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("user")
	public Result save(User user) {
		boolean res = userService.save(user);
		return Result.ok("OK",res);
	}
}
