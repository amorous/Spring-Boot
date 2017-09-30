package com.example.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 启动SpringBoot程序,而后自带子包扫描
public class SampleController {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}

}
