package com.example.microboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController extends AbstractBaseController {

	@RequestMapping("/message")
	public String message(String mid) {
		System.out.println("访问地址：" + super.getMessage("member.add.page"));
		return super.getMessage("welcome.msg", mid);
	}

}
