package com.superluli.redis.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class TestController {
	
	static int id = 0;
	
	@Resource(name = "redisMap")
	Map<String, Object> map;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(){
		System.out.println(map.values());
		return "";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String post(){
		map.put(String.valueOf(id), "XXX");
		id ++;
		return "";
	}
}
