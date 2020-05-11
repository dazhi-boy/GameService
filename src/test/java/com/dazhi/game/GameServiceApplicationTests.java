package com.dazhi.game;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dazhi.game.base.entity.User;
import com.dazhi.game.base.service.UserService;

@SpringBootTest
class GameServiceApplicationTests {

	@Autowired
	UserService userService;
	@Test
	void contextLoads() {
		User user = new User();
		user.setActive(true);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		userService.save(user);
	}

}
