package com.pyo.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MultiFileMember {
	private String userId;
	private String password;
	private MultipartFile picture;

}