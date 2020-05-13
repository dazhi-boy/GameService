package com.dazhi.game.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@ApiOperation(value = "添加用户")
	@PostMapping("/add")
	public Result save(@RequestBody User user) {
		boolean res = userService.save(user);
		return Result.ok("OK", res);
	}

	@ApiOperation(value = "更新用户")
	@PutMapping
	public Result update(@RequestBody User user) {
		boolean res = userService.updateById(user);
		return Result.ok("OK", res);
	}

	@ApiOperation(value = "通过id删除指定用户")
	@DeleteMapping("/{id}")
	public Result delete(@PathVariable("id") Long id) {
		boolean res = userService.removeById(id);
		return Result.ok("OK", res);
	}

	@ApiOperation(value = "通过id获取指定用户")
	@GetMapping("/{id}")
	public Result<User> get(@PathVariable("id") Long id) {
		User user = userService.getById(id);
		Result<User> result = Result.ok("OK");
		result.setData(user);
		return result;
	}
	@ApiOperation(value = "获取用户列表")
	@GetMapping
	public Result<List<User>> list(){
		List<User> list = userService.list();
		Result<List<User>> result = Result.ok("OK");
		result.setData(list);
		return result;
	}
}
