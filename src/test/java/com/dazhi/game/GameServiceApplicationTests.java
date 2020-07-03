package com.dazhi.game;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.mapper.UserMapper;
import com.dazhi.game.base.service.IUserService;

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GameServiceApplicationTests {

	@Resource
	IUserService userService;

	@Resource
	UserMapper userMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

	@Test
	void updateTest() {
		User user = new User();
		user.setId(1260097727314231298L);
		user.setVersion(2);
        // user.setUsername("qqq");
		user.setPassword("123");
		userMapper.updateById(user);
	}

	@Test
	void contextLoads() {
		User user = new User();
		// user.setId(6L);
		// user.setVersion(1);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		// userService.save(user);
		userMapper.insert(user);
		// // List<User> selectList = userMapper.selectList(null);
		// // System.out.println(selectList);
		// System.out.println("-----------------");
	}

	@Test
	void listTest() {
        // List<User> selectList = userMapper.selectList(null);
        // System.out.println(selectList);
        String string = redisTemplate.opsForValue().get("k1");
        System.out.println(string);
	}
}
