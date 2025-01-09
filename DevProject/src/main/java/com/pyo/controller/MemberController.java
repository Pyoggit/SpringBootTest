package com.pyo.controller;

import java.io.File;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pyo.domain.FileMember;
import com.pyo.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

	@PostMapping(value = "/insert")
	public String insertMember(Member member) {
		log.info("insertMember");
		return "home";
	}
	@PostMapping(value = "/redirect")
	public String redirecttMember(Member member, RedirectAttributes rttr) {
		log.info("inserttMember");
		rttr.addFlashAttribute("member", member);
		return "redirect:/member/result";
	}
	@GetMapping(value = "/result")
	public String redirectMember() {
		log.info("insertMember");
		return "result";
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