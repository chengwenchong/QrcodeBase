package com.cheng.qrcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cheng.qrcode.domain.Test;

@RestController
@RequestMapping("/v1")
public class TestController {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public List<Test> addTestData(){
		Test test=new Test();
		test.setLoginName("chengwc");
		test.setPassword("123456");
		System.out.println(mongoTemplate);
		mongoTemplate.insert(test);
		return mongoTemplate.find(new Query(Criteria.where("password").is(test.getPassword())), Test.class);
	}
}
