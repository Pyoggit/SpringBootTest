package com.pyo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Log
@Controller
public class HomeController {
	@GetMapping(value = "/formHome")
	public String formHome() {
		log.info("GET 방식 formHome");
		return "formHome";
	}
}