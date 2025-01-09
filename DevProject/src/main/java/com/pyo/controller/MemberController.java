package com.pyo.controller;

import java.io.File;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pyo.domain.Address;
import com.pyo.domain.FileMember;
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
		log.info("member" + member);
		log.info("address" + address);
		return "home";
	}

	@RequestMapping(value = "/registerFileUp01", method = RequestMethod.POST)
	public String registerFileUp01(FileMember filemember) throws Exception {
		if (!filemember.getPicture().isEmpty()) {
			for (MultipartFile data : filemember.getPicture()) {
				log.info("registerFileUp01");
				log.info("originalName: " + data.getOriginalFilename());
				log.info("size: " + data.getSize());
				log.info("contentType: " + data.getContentType());
				if (!data.isEmpty()) {
					String fileName = data.getOriginalFilename();
					data.transferTo(new File("C:/SpringBootProject/upload_files/" + fileName));
				}

			}
		}

		return "home";
	}

	@PostMapping(value = "/register06")
	public ResponseEntity<String> register06(@RequestBody List<Member> memberList) {
		log.info("register06");
		for (Member member : memberList) {
			log.info("userId = " + member.getUserId());
			log.info("password = " + member.getPassword());
		}
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}

	@RequestMapping(value = "/uploadAjax", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
	public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
		String originalFilename = file.getOriginalFilename();
		log.info("originalName: " + originalFilename);
		log.info("size: " + file.getSize());
		log.info("contentType: " + file.getContentType());
		if (!file.isEmpty()) {
			String fileName = file.getOriginalFilename();
			file.transferTo(new File("C:/SpringBootProject/upload_files/" + fileName));
		}
		
		ResponseEntity<String> entity = new ResponseEntity<String>("UPLOAD SUCCESS " + originalFilename, HttpStatus.OK);
		
		return entity;
	}

}