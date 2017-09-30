package com.example.microboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.microboot.controller.HelloController;

import junit.framework.TestCase;

@SpringBootTest(classes = SampleController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class SampleControllerTest {

	@Autowired
	private HelloController helloController;

	@Test
	public void test() {
		TestCase.assertEquals(helloController.hello(), "Hello World!");
	}

}
