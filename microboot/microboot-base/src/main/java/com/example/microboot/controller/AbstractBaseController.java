package com.example.microboot.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;

public abstract class AbstractBaseController {

	@Resource
	private MessageSource messageSource;

	public String getMessage(String key, String... args) {
		return messageSource.getMessage(key, args, Locale.getDefault());
	}

}
