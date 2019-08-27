package com.sts.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AjaxController {

	@RequestMapping(value = "/ajax_ex1.do", method = RequestMethod.GET)
	public String ajaxEx1() {
		return "ajax_ex1";
	}
	
	@RequestMapping(value = "/ajax_ex2.do", method = RequestMethod.GET)
	public String ajaxEx2() {
		return "ajax_ex2";
	}
	
	@RequestMapping(value = "/ajax_ex3.do", method = RequestMethod.GET)
	public String ajaxEx3() {
		return "ajax_ex3";
	}
}
