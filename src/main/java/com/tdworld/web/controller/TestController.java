package com.tdworld.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tdworld.web.service.IMemberService;


@Controller
public class TestController {
	
	@Autowired
	private IMemberService memberService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		System.out.println("First time update code");
		model.addAttribute("list", memberService.getMemberList());
		return "helloworld";
	}

}
