package com.pyo.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public String home(Locale locale, Model model) {
		System.out.println("sysout2" + model);
		return "home";
	}
	@GetMapping(value="/ajaxhome")
	public String ajaxHome() {
		return "ajaxhome";
	}
	@GetMapping(value="/ajaxhome2")
	public String ajaxHome2() {
		return "ajaxhome2";
	}
	@GetMapping(value="/ajaxhome3")
	public String ajaxHome3() {
		return "ajaxhome3";
	}
}