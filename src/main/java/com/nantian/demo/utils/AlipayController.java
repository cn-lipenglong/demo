package com.nantian.demo.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alipay")
public class AlipayController {

	@RequestMapping("/notifyUrl")
	public String notifyUrl() {
		return "notify_url";
	}
	@RequestMapping("/returnUrl")
	public String returnUrl() {
		return "return_url";
	}
}
