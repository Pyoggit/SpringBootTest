package com.pyo.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyo.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

	@PostMapping(value = "/insert")
	public String insertMember(Member member, @DateTimeFormat(pattern = "yyyy/MM/dd") Date dateOfBirth) {
		log.info("insertMember");
		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getPassword() = " + member.getPassword());
		log.info("member.getCoin() = " + member.getCoin());
		log.info("Date dateOfBirth = " + member.getDateOfBirth());
		log.info("Date yyyy년도MM월dd일 = " + dateOfBirth);
		return "home";
	}

}