package com.pyo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	private String userId;
	private String password;
	private int coin;
	private Date dateOfBirth;

}
