package com.dazhi.game.base.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;

    @Resource(name = "redisTemplate2")
    private RedisTemplate<String, String> strRedisTemplate2;

    @ApiOperation(value = "测试")
    @PostMapping("/test")
    public Result test() {
        // strRedisTemplate.opsForValue().set("strKey", "zwqh");
        System.out.println(strRedisTemplate.opsForValue().get("k1"));
        // String string = redisTemplate.opsForValue().get("k1");
        // System.out.println(string);
        strRedisTemplate2.opsForValue().set("k2", "v2");
        System.out.println(strRedisTemplate2.opsForValue().get("k2"));
        return Result.ok("OK");
    }
}
