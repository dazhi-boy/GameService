package com.dazhi.game.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.service.IUserService;
import com.dazhi.game.common.BaseController;
import com.dazhi.game.common.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/base/user")
@Api(value = "/base/user", tags = "UserController", description = "用户管理接口")
public class UserController extends BaseController<User> {

	@Autowired
	public void setiService(IUserService userService) {
		super.setiService(userService);
	}

    // @Autowired
    // private StringRedisTemplate redisTemplate;

    @ApiOperation(value = "测试")
    @PostMapping("/test")
    public Result test() {
        // String string = redisTemplate.opsForValue().get("k1");
        // System.out.println(string);
        return Result.ok("OK");
    }
}
