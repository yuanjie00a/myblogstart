package com.my.blog.web.myblog;

import com.my.blog.web.myblog.bean.User;
import com.my.blog.web.myblog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyblogApplicationTests {
@Autowired
	UserService userService;
	@Test
	void contextLoads() {
		User userById = userService.findUserById(9);
		System.out.println(userById);
	}

}
