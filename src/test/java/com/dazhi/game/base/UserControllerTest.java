 package com.dazhi.game.base;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author Administrator
 * @date 2020/06/30
 */
// @RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @WebAppConfiguration
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void addUserTest() throws UnsupportedEncodingException, Exception {
        // String reString = mvc.perform(MockMvcRequestBuilders.post("/base/user/add").param("username",
        // "张三")).andReturn().getResponse().getContentAsString();
        // System.out.println(reString);
        String string = redisTemplate.opsForValue().get("k1");
        System.out.println(string);
    }

}
