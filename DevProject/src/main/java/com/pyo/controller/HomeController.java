package com.pyo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//locale, model 객체주입된것을 활용해서 출력
		Date date = new Date(); 
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formatedDate = df.format(date);
		model.addAttribute("작업시간", formatedDate);
		
		logger.info("logger2"+model);
		System.out.println("sysout2"+model);
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
	@GetMapping(value="/ajaxhome4")
	public String ajaxHome4() {
		return "ajaxhome4";
	}
	
	
	@GetMapping(value="/gohome01")
	public String gohome01() {
		log.info("redirect:/gohome02");
		return "redirect:/gohome02" ;
	}
	@GetMapping(value="/gohome02")
	public String gohome02() {
		log.info("/gohome02");
		return "home";
	}
}