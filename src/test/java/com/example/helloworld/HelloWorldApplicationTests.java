package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

@SpringBootTest
class HelloWorldApplicationTests {

	@Test
	void contextLoads() {
		//Added Assertion To Check
		Assert.assertEquals(4,2+2);
	}

}
