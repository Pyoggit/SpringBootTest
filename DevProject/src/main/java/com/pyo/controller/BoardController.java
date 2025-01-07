package com.pyo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
// @RequestMapping의 value 속성에 요청 경로를 설정한다.
// register 경로에 GET 방식 설정
	@GetMapping(value = "/register")
	public String registerForm() {
		log.info("GET 방식 등록 폼");
		return "success";
	}

// register 경로에 POST 방식 설정
	@PostMapping(value = "/register")
	public String register() {
		log.info("POST 방식 등록");
		return "success";
	}

//modify 경로에 GET 방식
	@GetMapping(value = "/modify")
	public String modifyForm() {
		log.info("GET 방식 수정 폼");
		return "success";
	}

//modify 경로에 POST 방식
	@PostMapping(value = "/modify")
	public String modify() {
		log.info("POST 방식 수정");
		return "success";
	}

//remove 경로에 POST 방식
	@PostMapping(value = "/remove")
	public String remove() {
		log.info("POST 방식 삭제");
		return "success";
	}

//list 경로에 GET 방식
	@GetMapping(value = "/list")
	public String list() {
		log.info("GET 방식 목록");
		return "success";
	}
}
