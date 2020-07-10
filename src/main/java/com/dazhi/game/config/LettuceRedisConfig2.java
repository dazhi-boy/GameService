 package com.dazhi.game.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author Administrator
 * @date 2020/07/08
 */
@Configuration
public class LettuceRedisConfig2 {
    @Value("${spring.redis2.client-name}")
    private String clientName;
    @Value("${spring.redis2.database}")
    private String database;
    @Value("${spring.redis2.timeout}")
    private String timeout;
    @Value("${spring.redis2.sentinel.master}")
    private String master;
    @Value("${spring.redis2.sentinel.nodes}")
    private List<String> nodes = new ArrayList<String>();


    @Bean(name = "redisTemplate2")
    public RedisTemplate<String, Serializable> redisTemplate2() {
        RedisSentinelConfiguration sentinelConfiguration = new RedisSentinelConfiguration();
        sentinelConfiguration.setDatabase(2);
        sentinelConfiguration.setMaster("mymaster");
        List<RedisNode> iterable = new ArrayList<RedisNode>();
        RedisNode redisNode = new RedisNode("192.168.2.121", 26382);
        iterable.add(redisNode);
        RedisNode redisNode2 = new RedisNode("192.168.2.121", 26381);
        iterable.add(redisNode2);
        sentinelConfiguration.setSentinels(iterable);
        LettuceConnectionFactory connectionFactory2 = new LettuceConnectionFactory(sentinelConfiguration);
        connectionFactory2.afterPropertiesSet();

        RedisTemplate<String, Serializable> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(connectionFactory2);
        return redisTemplate;
    }
}
