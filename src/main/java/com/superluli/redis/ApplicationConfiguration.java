package com.superluli.redis;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.support.collections.DefaultRedisMap;

@ComponentScan
@EnableAutoConfiguration
@Configuration
public class ApplicationConfiguration {

	@Autowired
	StringRedisTemplate stringRedisTemplate;
	
	@Bean(name = "redisMap")
	public Map<String, Object> redisMap() {
		Map<String, Object> redisMap = new DefaultRedisMap<String, Object>("K1", stringRedisTemplate);
		//make it fail early, if cannot connect to Redis
		redisMap.entrySet();
		return redisMap;
	}
}
