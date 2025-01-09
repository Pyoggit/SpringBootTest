package com.pyo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyo.domain.Address;
import com.pyo.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

	@PostMapping(value = "/insert")
	public String insertMember(Member member, Address address) {
		log.info("insertMember");
		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getPassword() = " + member.getPassword());
		log.info("member.getCoin() = " + member.getCoin());
		log.info("Date dateOfBirth = " + member.getDateOfBirth());
		if(member.getCar() != null) {
			for(String data : member.getCar()) {
				log.info("membercar = " + data);		
			}
		}
		log.info("member.toString"+ member);
		log.info("address.toString"+ address);
		return "home";
	}

}