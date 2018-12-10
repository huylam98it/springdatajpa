package com.huylam98it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	
	@Autowired
	StudentDao studentDao;
	
	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("list", studentDao.findAll());
		return "home";
	}
}
