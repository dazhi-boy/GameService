package com.dazhi.game;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.mapper.UserMapper;
import com.dazhi.game.base.service.UserService;
import com.dazhi.game.base.service.UserTest;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GameServiceApplicationTests {

	@Resource
	UserService userService;

	@Resource
	UserTest userTest;

	@Resource
	UserMapper userMapper;

	@Test
	void serviceTest() {
		List<User> selectList = userTest.list();
		System.out.println(selectList);
		// User user = new User();
		// // user.setId(6L);
		// user.setVersion(2);
		// user.setActive(true);
		// user.setUsername("zhangsan");
		// user.setPassword("123456");
		// userService.save(user);
	}

	@Test
	void updateTest() {
		User user = new User();
		user.setId(1260097727314231298L);
		// user.setVersion(2);
		user.setActive(false);
		user.setUsername("lalla");
		user.setPassword("123");
		userMapper.updateById(user);
	}

	@Test
	void contextLoads() {
		User user = new User();
		// user.setId(6L);
		// user.setVersion(1);
		user.setActive(true);
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
		List<User> selectList = userMapper.selectList(null);
		System.out.println(selectList);
	}
}
